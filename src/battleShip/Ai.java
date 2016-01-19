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
        System.out.println(ships.size());
        while (ships.size() != 3) {
            Ship tempShip = new Ship(3, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        System.out.println(ships.size());
        while (ships.size() != 6) {
            Ship tempShip = new Ship(2, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        System.out.println(ships.size());
        while (ships.size() != 10) {
            Ship tempShip = new Ship(1, Point.getRandomPoint(field.WIDTH, field.HEIGHT), random.nextBoolean());
            addShipToArray(tempShip);
        }
        System.out.println(ships.size());
        for (int number = 0; number < ships.size(); number++) {
            if (ships.get(number).isHorizontal) {
                for (int i = ships.get(number).leftUp.x; i < ships.get(number).leftUp.x + ships.get(number).length; i++) {
                    field.cells[i][ships.get(number).leftUp.y].view = '\u2588'; //2B1A - потоплен
                }

            }
            if (!ships.get(number).isHorizontal) {
                for (int j = ships.get(number).leftUp.y; j < ships.get(number).leftUp.y + ships.get(number).length; j++) {
                    field.cells[ships.get(number).leftUp.x][j].view = '\u2588';
                }

            }

        }
    }

    private void addShipToArray(Ship tempShip) {
        boolean intersect = false;
        if (field.isNotOutOfRange(tempShip)) {
            for (int i = 0; i < ships.size(); i++) {
                if (tempShip.isIntersect(ships.get(i))) {
                    intersect = true;
                }
            }
            if (!intersect) {
                ships.add(tempShip);
            }
        }
    }


    public void putShipToField(int number) {

        ships.get(number).leftUp.x = random.nextInt(10);
        ships.get(number).leftUp.y = random.nextInt(10);

        if (ships.get(number).isHorizontal) {
            if (field.isNotOutOfRange(ships.get(number))) {
                for (int i = ships.get(number).leftUp.x; i < ships.get(number).leftUp.x + ships.get(number).length; i++) {
                    field.cells[i][ships.get(number).leftUp.y].view = '\u2588'; //2B1A - потоплен
                }
            } else putShipToField(number);
        }
        if (!ships.get(number).isHorizontal) {
            if (field.isNotOutOfRange(ships.get(number))) {
                for (int j = ships.get(number).leftUp.y; j < ships.get(number).leftUp.y + ships.get(number).length; j++) {
                    field.cells[ships.get(number).leftUp.x][j].view = '\u2588';
                }
            } else putShipToField(number);
        }
    }

}

