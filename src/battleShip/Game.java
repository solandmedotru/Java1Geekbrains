package battleShip;


public class Game {
    Player player = new Player();
    Ai ai = new Ai();

    public void loop(){
        System.out.println("\t\t\tПоле ИГРОКА");
        player.field.init('~');
        player.field.show();
        System.out.println();
        System.out.println("\t\t\tПоле КОМПЬЮТЕРА");
        ai.field.init('-');
        ai.field.show();
    }

}
