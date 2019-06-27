import main.java.robots.RobotBig;
import main.java.robots.RobotSmall;
import main.java.robots.RobotStrong;


import  java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int choice=random.nextInt(12) +1;


        if (choice >=1 && choice <=3){
            RobotStrong robot =new RobotStrong("Strong", "01.00.a");
            robot.speak();
            robot.showVersion();

        } else if (choice >=4 && choice <=8){
            RobotSmall robot =new RobotSmall("Small", "01.11.b", true);
            robot.speak();
            robot.showVersion();

        } else if (choice >=9 && choice <=12) {
            RobotBig robot=new RobotBig("Big","01.22.c", false);
            robot.speak();
            robot.showVersion();
        }
    }




}

