package main.java.robots;

public class RobotBig extends RobotSmall {

    private boolean big=true;
    private String name;

    public RobotBig(String name, String version, boolean small) {
        super(name, version, small);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I'm not big");
    }



    public RobotBig() {


    }
}
