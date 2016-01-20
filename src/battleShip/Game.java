package battleShip;


public class Game {
    Player player = new Player();
    Ai ai = new Ai();

    public void loop() {
        init();
        player.selectGameMode();

        ai.autoCreateShips();
        showFields();
    }



    private void init() {
        System.out.println("ИГРА МОРСКОЙ БОЙ!");
        player.field.init('.');
        ai.field.init('.');
    }

    private void showFields() {
        System.out.println("\t\t\tПоле ИГРОКА");
        player.field.show();
        System.out.println();
        System.out.println("\t\t\tПоле КОМПЬЮТЕРА");
        ai.field.show();

    }


}
