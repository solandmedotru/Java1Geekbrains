package battleShip;

public class Ship {
    int size;
    int positionX;
    int positionY;
    boolean direction;

    public Ship(int size) {
        this.size = size;
    }

    public boolean isGoodPosition(Ship ship, Field field){
        if (ship.direction){
            if(ship.positionX + ship.size < field.cells.length){
                for (int i = ship.positionX; i < ship.positionX + ship.size; i++) {
                    if (field.cells[i][positionY].view != '.') {
                        return false;
                    }
                }
                return true;
            }
        }
        if (!ship.direction){
            if(ship.positionY + ship.size < field.cells.length){
                for (int j = ship.positionY; j < ship.positionY + ship.size; j++) {
                    if (field.cells[positionX][j].view != '.') {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
