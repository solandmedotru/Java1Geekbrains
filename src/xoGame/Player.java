package xoGame;

import java.util.Scanner;

public class Player {
    int x;
    int y;

    public static void nextPlayerStep(Player player) {
        do {
            System.out.println("Ваш ход! Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            player.x = scanner.nextInt();
            System.out.println("Ваш ход! Введите столбец: ");
            player.y = scanner.nextInt();
            if (!Field.isValidXY(player.x, player.y)){
                nextPlayerStep(player);
            }
        } while (Field.isHaveNotNextStep() | Field.cells[player.x][player.y].view == 'X' & Field.cells[player.x][player.y].view == 'O' );
        Field.cells[player.x][player.y].view = 'X';
    }
}
