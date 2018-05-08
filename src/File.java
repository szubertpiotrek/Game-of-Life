import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Piotr Szubert on 28.04.2017.
 */
public class File {

    public Table readFile(Table board) throws FileNotFoundException {
        int x=6;
        int y=6;
        board.board = new int[x][y];
        int[] numbers = new int[100];

        //wczytanie pliku o ustalonej wielkosci

        Scanner scn = new Scanner(new BufferedReader(new FileReader("File.txt")));

        int i=0;
        while (scn.hasNextInt()){
                int inti = scn.nextInt();
                numbers[i]= inti;
                i++;
        }

        int k=0;
        for(int z = 1; z < board.getXLenght()-1; z++) {
            for (int j = 1; j < board.getYLenght()-1; j++) {
                board.board[z][j] =numbers[k];
                k++;
            }
        }

        return board;
    }
}
