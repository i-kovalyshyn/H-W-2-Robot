package main.java.robots;

public class RobotBig extends RobotSmall {

    private boolean big;


    public RobotBig(String name, String version, boolean small, boolean big) {
        super(name, version, small);
        this.big=big;


    }


    @Override
    public void speak() {
        super.speak();
        System.out.println("I'm big: " + big);
    }


}
