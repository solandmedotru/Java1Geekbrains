package battleShip;

import java.util.Random;

public class Point {
    int x;
    int y;


    static Point getRandomPoint(int maxX, int maxY) {
        Point tempPoint = new Point();
        Random random = new Random();
        tempPoint.x = random.nextInt(maxX);
        tempPoint.y = random.nextInt(maxY);
        return tempPoint;
    }
}
