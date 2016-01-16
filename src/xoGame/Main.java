package xoGame;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Ai ai = new Ai();
        System.out.println("Игра началась!");

        Field.initXOField();
        mainGameLoop(player, ai);
        System.out.println("Game Over");

    }

    private static void mainGameLoop(Player player, Ai ai) {
        while (!Field.isHaveNotNextStep()) {
            Field.showXOField();
            Player.nextPlayerStep(player);
            Field.showXOField();
            if (Field.isHaveNotNextStep()){
                break;
            }
            Ai.nextAiStep(ai);
        }
    }




}
