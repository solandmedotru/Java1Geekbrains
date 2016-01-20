package battleShip;

import java.util.Scanner;

public class Player extends Ai {

    public void manualCreateShips() {
        System.out.println("Ручная расстановка пока не реализована"); //TODO реализовать метод ручной расстановки кораблей
    }

    public void selectGameMode() {
        System.out.println("Выбирите режим игры: \n1 - автоматическая расстановка своих кораблей,\n2 - ручная расстановка своих кораблей.");
        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        int playerChoice;
        if (scanner.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            playerChoice = scanner.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

            if (playerChoice == 1) {
                autoCreateShips();
            } else if (playerChoice == 2) {
                manualCreateShips();
            } else {
                System.out.println("Вы ввели неверное число");
                selectGameMode();
            }
        } else {
            System.out.println("Вы ввели не число");
            selectGameMode();
        }
    }

}
