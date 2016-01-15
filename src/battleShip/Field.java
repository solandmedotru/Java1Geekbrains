package battleShip;


public class Field {

    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    public static Cell[][] cells = new Cell[WIDTH][HEIGHT];

    public static void initField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = new Cell(i, j, '~');
                cells[i][j] = cell;
            }
        }
    }

    public static void showField() {
        for (int i = 0; i < cells.length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.println("\t" + "______________________________________");
        for (int i = 0; i < cells.length; i++) {
            System.out.print(i + " |" + "\t");
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j].view + "\t");
            }
            System.out.println();
        }
    }
}
