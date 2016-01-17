package battleShip;

public class Player {
    Field field = new Field();
    Ship ship1_1 = new Ship(1);
    Ship ship1_2 = new Ship(1);
    Ship ship1_3 = new Ship(1);
    Ship ship2_1 = new Ship(2);
    Ship ship2_2 = new Ship(2);
    Ship ship3_1 = new Ship(3);
    Ship ship4_1 = new Ship(4);

    public void setShips(){
        //TODO написать логику расстановки кораблей
        field.cells[1][1].view = '#';

    }
}
