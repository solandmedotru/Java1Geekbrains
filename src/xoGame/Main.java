package xoGame;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Ai ai = new Ai();
        System.out.println("Игра началась!");

        Field.initXOField();
        mainGameLoop(player, ai);

        showWinner(player, ai);
        System.out.println("Game Over");

    }

    private static void showWinner(Player player, Ai ai) {
        if (player.iswinner){
            Field.showXOField();
            System.out.println("Вы победили! Ура!");
        }
        if (ai.iswinner){
            Field.showXOField();
            System.out.println("Увы! Но вы проиграли!");
        }
    }

    private static void mainGameLoop(Player player, Ai ai) {
        while (Field.isHaveNextStep() && !Field.isHaveWinner(player, ai)) {
            Field.showXOField();
            Player.nextPlayerStep(player);
            Field.showXOField();
            if (!Field.isHaveNextStep() || Field.isHaveWinner(player,ai)){
                break;
            }
            Ai.nextAiStep(ai);
        }
    }




}
