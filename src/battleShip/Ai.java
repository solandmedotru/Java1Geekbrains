package battleShip;

import java.util.Random;

public class Ai {
    Field field = new Field();

    Ship ship1_1 = new Ship(1);
    Ship ship1_2 = new Ship(1);
    Ship ship1_3 = new Ship(1);
    Ship ship1_4 = new Ship(1);
    Ship ship2_1 = new Ship(2);
    Ship ship2_2 = new Ship(2);
    Ship ship2_3 = new Ship(2);
    Ship ship3_1 = new Ship(3);
    Ship ship3_2 = new Ship(3);
    Ship ship4_1 = new Ship(4);

    public void setShips() {
        //TODO написать логику расстановки кораблей
        setShip(ship4_1);
        setShip(ship3_1);
        setShip(ship3_2);
        setShip(ship2_1);
        setShip(ship2_2);
        setShip(ship2_3);
        setShip(ship1_1);
        setShip(ship1_2);
        setShip(ship1_3);
        setShip(ship1_4);
    }

    private void setShip(Ship ship) {
        Random random = new Random();
        ship.positionX = random.nextInt(10);
        ship.positionY = random.nextInt(10);
        ship.isVerticalDirection = random.nextBoolean();

        if (ship.isVerticalDirection) {
            if (ship.isNotOutOfRange(ship, field)) {
                for (int i = ship.positionX; i < ship.positionX + ship.size; i++) {
                    field.cells[i][ship.positionY].view = '\u2588'; //2B1A - потоплен
                    field.cells[i][ship.positionY].ship = ship;
                }
            } else setShip(ship);
        } else
            if (ship.isNotOutOfRange(ship, field)) {
                for (int j = ship.positionY; j < ship.positionY + ship.size; j++) {
                    field.cells[ship.positionX][j].view = '\u2588';
                    field.cells[ship.positionY][j].ship = ship;
                }
            } else setShip(ship);

    }
}
