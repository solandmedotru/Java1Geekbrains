package battleShip;


public class Game {
    Player player = new Player();
    Ai ai = new Ai();

    public void loop(){
        init();
        player.setShips();
        ai.setShips();
        show();
    }

    private void init() {
        player.field.init('.');
        ai.field.init('.');
    }

    private void show() {
        System.out.println("\t\t\tПоле ИГРОКА");
        player.field.show();
        System.out.println();
        System.out.println("\t\t\tПоле КОМПЬЮТЕРА");
        ai.field.show();
    }
}
