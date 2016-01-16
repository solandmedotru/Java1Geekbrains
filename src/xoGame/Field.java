package xoGame;

import java.util.Arrays;

public class Field {

    public static final int WIDTH = 3;
    public static final int HEIGHT = 3;
    public static Cell[][] cells = new Cell[WIDTH][HEIGHT];

    public static void initXOField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = new Cell(i, j, '.');
                cells[i][j] = cell;
            }
        }
    }

    public static void showXOField() {
        for (int i = 0; i < cells.length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.println("\t" + "__________");
        for (int i = 0; i < cells.length; i++) {
            System.out.print(i + " |" + "\t");
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j].view + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isHaveNotNextStep(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j].view == '.')
                    return false;
            }
        }
        return true;
        //return Arrays.asList(cells).contains('.');
    }

    public static boolean isValidXY(int x, int y){
        if (x > Field.cells.length - 1 | y > Field.cells.length - 1 | x < 0 | y < 0){
            return false;
        }
        return true;
    }



}
