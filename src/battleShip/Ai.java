package battleShip;

import java.util.ArrayList;
import java.util.Random;

public class Ai {
    Field field = new Field();
    Random random = new Random();

    ArrayList<Ship> ships = new ArrayList<>();


    public void createShips() {

        while (ships.size() != 1) {
            Ship tempShip = new Ship(4, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            if (field.isNotOutOfRange(tempShip)) {
                ships.add(tempShip);
            }
        }
        while (ships.size() != 3) {
            Ship tempShip = new Ship(3, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        while (ships.size() != 6) {
            Ship tempShip = new Ship(2, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        while (ships.size() != 10) {
            Ship tempShip = new Ship(1, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        for (Ship ship : ships) {
            if (ship.isHorizontal) {
                for (int i = ship.leftUp.x; i < ship.leftUp.x + ship.length; i++) {
                    field.cells[i][ship.leftUp.y].view = '\u2588'; //2B1A - потоплен
                }
            }
            if (!ship.isHorizontal) {
                for (int j = ship.leftUp.y; j < ship.leftUp.y + ship.length; j++) {
                    field.cells[ship.leftUp.x][j].view = '\u2588';
                }
            }
        }
    }

    private void addShipToArray(Ship tempShip) {
        boolean intersect = false;
        if (field.isNotOutOfRange(tempShip)) {
            for (Ship ship : ships) {
                if (tempShip.isIntersect(ship)) {
                    intersect = true;
                }
            }
            if (!intersect) {
                ships.add(tempShip);
            }
        }
    }
}

