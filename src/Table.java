/**
 * Created by Piotr Szubert on 25.04.2017.
 */
import java.util.Random;

public class Table {

    public static final int ALIVE = 1;
    public static final int DEAD = 0;

    public int[][] board;

    public Table(int x, int y){
        board=new int[x+2][y+2];
    }

    public Table(Table table) {
        board=new int[table.getXLenght()][table.getYLenght()];
    }

    public Table() {
        board=new int[3][3];
    }

    public int isAlive(int x, int y){
        int alive=0;
            for(int i=x;i<=x;i++){
                for(int j=y;j<=y;j++){
                    if(board[x][y]==1){
                        alive++;
                }
            }
        }
        return alive;
    }


    public int getXLenght(){
        return board.length;
    }

    public int getYLenght(){
        return board[0].length;
    }

    public void setAlive(int x, int y) {
        this.board[x][y] = ALIVE;
    }

    public void setDead(int x, int y) {
        this.board[x][y] = DEAD;
    }

    public void printTable(Table board) {
        for(int i =1;i<board.getXLenght()-1;i++) {
            System.out.print("\t\n");
            for (int j = 1; j < board.getYLenght()-1; j++) {
                System.out.print(board.board[i][j] + "\t");
            }
        }
    }

    public void generateBoard(Table board, int probability){
        for(int i =1;i<board.getXLenght()-1;i++){
            for(int j=1;j<board.getYLenght()-1;j++){
                Random random=new Random();
                board.board[i][j]=random.nextInt(probability);
            }
        }
    }
}

