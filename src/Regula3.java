/**
 * Created by Piotr Szubert on 01.05.2017.
 */
public class Regula3 {
    public Table makeMove(Table table){

        Table newStep = new Table(table);

        for(int i=1;i<table.getXLenght()-1;i++){
            for(int j=1;j<table.getYLenght()-1;j++){
                if(table.isAlive(i,j)==1){
                    if(countNeighbours(i,j,table)==5 || countNeighbours(i,j,table)==2){
                        newStep.setAlive(i,j);
                    }
                    if(countNeighbours(i,j,table)<2 || countNeighbours(i,j,table)>5){
                        newStep.setDead(i,j);
                    }
                }
                if(table.isAlive(i,j)!=1){
                    if(countNeighbours(i,j,table)==3){
                        newStep.setAlive(i,j);
                    }
                }

            }
        }
        return newStep;
    }

    public int countNeighbours(int x, int y, Table table) {
        int alive = 0;
        if (table.isAlive(x, y - 1) == 1) {
            alive++;
        }
        if (table.isAlive(x, y + 1) == 1) {
            alive++;
        }
        if (table.isAlive(x - 1, y - 1) == 1) {
            alive++;
        }
        if (table.isAlive(x - 1, y) == 1) {
            alive++;
        }
        if (table.isAlive(x - 1, y + 1) == 1) {
            alive++;
        }
        if (table.isAlive(x + 1, y - 1) == 1) {
            alive++;
        }
        if (table.isAlive(x + 1, y) == 1) {
            alive++;
        }
        if (table.isAlive(x + 1, y + 1) == 1) {
            alive++;
        }
        return alive;
    }
}
