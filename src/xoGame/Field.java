package xoGame;

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

    public static boolean isHaveNextStep(){
        for (Cell[] cell : cells) {
            for (Cell aCell : cell) {
                if (aCell.view == '.')
                    return true;
            }
        }
        return false;
    }



}
