package battleShip;

public class Ship {
    int size;
    int positionX;
    int positionY;
    boolean isVerticalDirection;
    int dx;
    int dy;

    public Ship(int size) {
        this.size = size;
    }

    public boolean isNotOutOfRange(Ship ship, Field field) {
        if (ship.isVerticalDirection) {
            if (ship.positionX + ship.size < field.cells.length) {
                return true;
            }
        }
        if (!ship.isVerticalDirection) {
            if (ship.positionY + ship.size < field.cells.length) {
                return true;
            }
        }
        return false;
    }
}
