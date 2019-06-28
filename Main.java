import main.java.messages.Messages;
import main.java.robots.RobotBig;
import main.java.robots.RobotSmall;
import main.java.robots.RobotStrong;

import java.util.Random;

public class Main {

    private static final int FLY = 1;
    private static final int SWIM = 2;
    private static final int SUN_PROTECT = 3;

    public static void main(String[] args) {
        Messages.sayHallo();

        Random random = new Random();
        int choice = random.nextInt(12) + 1;

        RobotStrong robotMulti = new RobotStrong("Strong", "01.00.a");

        if (choice <= 3) {
            robotMulti.speak();
            robotMulti.shoot();
            robotMulti.walk();
            robotMulti.showVersion();
        } else if (choice <= 8) {
            robotMulti = new RobotSmall("Small", "01.11.b", true);
            robotMulti.speak();
            robotMulti.showVersion();
        } else {
            robotMulti = new RobotBig("Big", "01.22.c", false, true);
            robotMulti.speak();
            robotMulti.showVersion();
        }
        adaptationRobot(robotMulti, random);

        Messages.sayBye();
    }

    private static void adaptationRobot(RobotStrong robotMulti, Random random) {

        int choice = random.nextInt(3) + 1;
        switch (choice) {

            case FLY:
                robotMulti.fly();
                break;
            case SWIM:
                robotMulti.swim();
                break;
            case SUN_PROTECT:
                robotMulti.getSunProtect();
                break;
        }
    }
}

