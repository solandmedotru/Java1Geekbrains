package battleShip;

public class Cell {
    int x;
    int y;
    char view;
    Ship ship = null;
    boolean isShoot;

    public Cell(int x, int y, char view, Ship ship, boolean isShoot) {
        this.x = x;
        this.y = y;
        this.view = view;
        this.ship = ship;
        this.isShoot = isShoot;
    }
}
