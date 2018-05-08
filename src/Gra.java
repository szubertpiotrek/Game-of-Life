/**
 * Created by Piotr Szubert on 25.04.2017.
 */
//////////////////////////////////////////////////
// Klasa GraOŻycie

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gra{

    private Table board;
    private Conway strategia1;
    private Regula1 strategia2;
    private Regula2 strategia3;
    private Regula3 strategia4;
    private Regula4 strategia5;



    private Gra(){
    }

    private Gra(Table board){
        this.board=board;
        this.strategia1=new Conway();
        this.strategia2=new Regula1();
        this.strategia3=new Regula2();
        this.strategia4=new Regula3();
        this.strategia5=new Regula4();
    }

    private Table nextMove1(){
        board=strategia1.makeMove(board);
        board.printTable(board);
        return board;
    }
    private Table nextMove2(){
        board=strategia2.makeMove(board);
        board.printTable(board);
        return board;
    }
    private Table nextMove3(){
        board=strategia2.makeMove(board);
        board.printTable(board);
        return board;
    }
    private Table nextMove4(){
        board=strategia2.makeMove(board);
        board.printTable(board);
        return board;
    }
    private Table nextMove5(){
        board=strategia2.makeMove(board);
        board.printTable(board);
        return board;
    }


    public static void main(String[] args) {


        System.out.println("Wybierz typ rozpoczecia gry:\n");
        System.out.println("1.Wczytana z pliku.");
        System.out.println("2.Genererowana losowo-wielkosc wskazana przez uzytkownika.");
        System.out.println("3.Struktura niezmienna.");
        System.out.println("4.Struktura oscylacyjna.");

        //pobieranie danych

        Scanner scanner = new Scanner(System.in);
        int readInt = scanner.nextInt();

        //wczytanie z pliku

        if (readInt == 1) {
            Scanner scanner1 = new Scanner(System.in);
            File file = new File();
            Table b1 = new Table();
            try {
                b1 = file.readFile(b1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Gra GOŻ = new Gra(b1);
            b1.printTable(b1);
            System.out.println("\nKolejny ruch. Wciśnij 1!");
            readInt = scanner1.nextInt();
            while (readInt == 1) {
                if (readInt == 1) {
                    GOŻ.nextMove1();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 1!");
                readInt = scanner1.nextInt();
            }
            scanner1.close();
        }

        //generwoanie losowe

        if (readInt == 2) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Podaj wielkosc X tablicy:");
            readInt = scanner2.nextInt();
            int sizeX = Integer.valueOf(readInt);
            System.out.println("Podaj wielkosc Y tablicy:");
            readInt = scanner2.nextInt();
            int sizeY = Integer.valueOf(readInt);
            Table b1 = new Table(sizeX, sizeY);
            b1.generateBoard(b1, 2);
            System.out.println("\nTablica wyjsciowa:");
            b1.printTable(b1);
            Gra GOŻ = new Gra(b1);
            System.out.println("\n\nWybierz reguły:");
            System.out.println("1.Regula Conwaya. Wcisnij 1!");
            System.out.println("2.Regula Regula1. Wcisnij 2!");
            System.out.println("3.Regula Regula2. Wcisnij 3!");
            System.out.println("4.Regula Regula3. Wcisnij 4!");
            System.out.println("5.Regula Regula4. Wcisnij 5!");
            readInt = scanner2.nextInt();
            while (readInt == 1) {

                //regula Conway

                if (readInt == 1) {
                    GOŻ.nextMove1();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 1!");
                readInt = scanner2.nextInt();
            }
            while (readInt == 2) {

                //regula Regula1
                if (readInt == 2) {
                    GOŻ.nextMove2();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 2!");
                readInt = scanner2.nextInt();
            }
            while (readInt == 3) {

                //regula Regula2

                if (readInt == 3) {
                    GOŻ.nextMove3();
                } else {
                    break;
                }
                System.out.println("Kolejny ruch. Wciśnij 3!");
                readInt = scanner2.nextInt();

            }
            while (readInt == 4) {

                //regula Regula3

                if (readInt == 4) {
                    GOŻ.nextMove4();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 4!");
                readInt = scanner2.nextInt();
            }
            while (readInt == 5) {

                //regula Regula4
                if (readInt == 5) {
                    GOŻ.nextMove5();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 5!");
                readInt = scanner2.nextInt();
            }
            scanner2.close();
        }

        //struktura niezmienna wczytana z pliku

        if (readInt == 3) {
            Scanner scanner3 = new Scanner(System.in);
            NonVariable nonVariable=new NonVariable();
            Table b1 = new Table();
            try {
                b1 = nonVariable.readNonVariable(b1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Gra GOŻ = new Gra(b1);
            b1.printTable(b1);
            System.out.println("\nKolejny ruch. Wciśnij 1!");
            readInt = scanner3.nextInt();
            while (readInt == 1) {
                if (readInt == 1) {
                    GOŻ.nextMove1();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 1!");
                readInt = scanner3.nextInt();
            }
            scanner3.close();
        }

        //struktura oscylacyjna wczytana z pliku

        if (readInt == 4) {
            Scanner scanner4 = new Scanner(System.in);
            Oscillation oscillation=new Oscillation();
            Table b1 = new Table();
            try {
                b1 = oscillation.readOscillation(b1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Gra GOŻ = new Gra(b1);
            b1.printTable(b1);
            System.out.println("\nKolejny ruch. Wciśnij 1!");
            readInt = scanner4.nextInt();
            while (readInt == 1) {
                if (readInt == 1) {
                    GOŻ.nextMove1();
                } else {
                    break;
                }
                System.out.println("\nKolejny ruch. Wciśnij 1!");
                readInt = scanner4.nextInt();
            }
            scanner4.close();
        }
        scanner.close();
    }
}
