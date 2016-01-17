package battleShip;


public class Game {
    Field playerField = new Field();
    Field aiField = new Field();

    public void loop(){
        System.out.println("Поле ИГРОКА");
        playerField.init('~');
        playerField.show();
        System.out.println("Поле КОМПЬЮТЕРА");
        aiField.init('-');
        aiField.show();
    }

}
