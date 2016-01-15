package battleShip;

public class Cell {
    int x;
    int y;
    boolean isShoot;
    char view;

    public Cell(int x, int y, char view) {
        this.x = x;
        this.y = y;
        this.view = view;
    }
}
