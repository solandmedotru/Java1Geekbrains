package battleShip;

import java.util.Random;

public class Ai {
    Field field = new Field();

    Ship ship1_1 = new Ship(1);
    Ship ship1_2 = new Ship(1);
    Ship ship1_3 = new Ship(1);
    Ship ship2_1 = new Ship(2);
    Ship ship2_2 = new Ship(2);
    Ship ship3_1 = new Ship(3);
    Ship ship4_1 = new Ship(4);

    public void setShips() {
        //TODO написать логику расстановки кораблей
        setShip(ship4_1);
        setShip(ship3_1);
        setShip(ship2_1);
        setShip(ship2_2);
        setShip(ship1_1);
        setShip(ship1_2);
        setShip(ship1_3);
    }

    private void setShip(Ship ship) {
        Random random = new Random();
        ship.positionX = random.nextInt(10);
        ship.positionY = random.nextInt(10);
        ship.direction = random.nextBoolean();

        if (ship.direction) {
            if (ship.isGoodPosition(ship, field)) {
                for (int i = ship.positionX; i < ship.positionX + ship.size; i++) {
                    field.cells[i][ship.positionY].view = '=';
                }
            } else setShip(ship);
        } else
            if (ship.isGoodPosition(ship, field)) {
                for (int j = ship.positionY; j < ship.positionY + ship.size; j++) {
                    field.cells[ship.positionX][j].view = '=';
                }
            } else setShip(ship);

    }
}
