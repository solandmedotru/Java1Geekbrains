package lesson1h;

public class Alibaba {
    public static void main(String[] args) {
        greeting("разбойник", 40);
        say("разбойник", 40);
    }

    private static void say(String person, int col) {
        if (col == 1) {
            System.out.printf("До свидания %s!", person);
            System.out.println();
        } else {
            for (int i = 1; i <= col; i++) {
                System.out.printf("До свидания %s номер %d\n", person, i);
                say("колобок", 1);
            }
        }
    }

    private static void greeting(String person, int col) {
        if (col == 1) {
            System.out.printf("Здравствуй %s!", person);
            System.out.println();
        } else {
            for (int i = 1; i <= col; i++) {
                System.out.printf("Здравствуй %s номер %d\n", person, i);
                greeting("колобок", 1);
            }
        }
    }
}