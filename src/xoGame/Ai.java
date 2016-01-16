package xoGame;

import java.util.Random;

public class Ai {
    int x;
    int y;

    public static void nextAiStep(Ai ai) {
        do {
            Random random = new Random();
            ai.x = random.nextInt(3);
            ai.y = random.nextInt(3);
        } while (Field.isHaveNotNextStep() | Field.cells[ai.x][ai.y].view == 'X' | Field.cells[ai.x][ai.y].view == 'O' );
        Field.cells[ai.x][ai.y].view = 'O';
    }
}
