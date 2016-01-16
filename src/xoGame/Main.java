package xoGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Игра началась!");

        Field.initXOField();

        mainGameLoop(player);

    }

    private static void mainGameLoop(Player player) {
        while (Field.isHaveNextStep()) {
            Field.showXOField();
            do {
                askUser(player);
            } while (player.x > Field.cells.length-1 | player.y > Field.cells.length-1 | player.x < 0 | player.y < 0);
            Field.cells[player.x][player.y].view = 'X';
        }
    }

    private static void askUser(Player player) {
        System.out.println("Ваш ход! Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        player.x = scanner.nextInt();
        System.out.println("Ваш ход! Введите столбец: ");
        player.y = scanner.nextInt();
    }
}
