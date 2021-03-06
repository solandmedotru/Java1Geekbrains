package battleShip;

public class Field {
    final int WIDTH = 10;
    final int HEIGHT = 10;
    Cell[][] cells = new Cell[HEIGHT][WIDTH];

    public void init(char ch) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = new Cell(i, j, ch, null, false);
                cells[i][j] = cell;
            }
        }
    }

    public void show() {
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

    public boolean isNotOutOfRange(Ship ship) {
        if (ship.isHorizontal) {
            if (ship.leftUp.x + ship.length < HEIGHT) {
                return true;
            }
        }
        if (!ship.isHorizontal) {
            if (ship.leftUp.y + ship.length < WIDTH) {
                return true;
            }
        }
        return false;
    }
}
