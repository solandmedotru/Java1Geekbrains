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
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j].view == '.')
                    return true;
            }
        }
        return false;
    }
    public static boolean isHaveWinner(Player player, Ai ai){
        if (cells[0][0].view == 'X' && cells[1][0].view == 'X' && cells[2][0].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][0].view == 'O' && cells[1][0].view == 'O' && cells[2][0].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[0][1].view == 'X' && cells[1][1].view == 'X' && cells[2][1].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][1].view == 'O' && cells[1][1].view == 'O' && cells[2][1].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[0][2].view == 'X' && cells[1][2].view == 'X' && cells[2][2].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][2].view == 'O' && cells[1][2].view == 'O' && cells[2][2].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[0][0].view == 'X' && cells[0][1].view == 'X' && cells[0][2].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][0].view == 'O' && cells[0][1].view == 'O' && cells[0][2].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[1][0].view == 'X' && cells[1][1].view == 'X' && cells[1][2].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[1][0].view == 'O' && cells[1][1].view == 'O' && cells[1][2].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[2][0].view == 'X' && cells[2][1].view == 'X' && cells[2][2].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[2][0].view == 'O' && cells[2][1].view == 'O' && cells[2][2].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[0][0].view == 'X' && cells[1][1].view == 'X' && cells[2][2].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][0].view == 'O' && cells[1][1].view == 'O' && cells[2][2].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        if (cells[0][2].view == 'X' && cells[1][1].view == 'X' && cells[2][0].view == 'X') {
            player.isWinner = true;
            return true;
        }
        if (cells[0][2].view == 'O' && cells[1][1].view == 'O' && cells[2][0].view == 'O') {
            ai.isWinner = true;
            return true;
        }

        return false;
    }

    public static boolean isValidXY(int x, int y){
        if (x > Field.cells.length - 1 | y > Field.cells.length - 1 | x < 0 | y < 0){
            return false;
        }
        return true;
    }



}
