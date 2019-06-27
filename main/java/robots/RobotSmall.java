package main.java.robots;

public class RobotSmall extends RobotStrong {

    private boolean small;

    public RobotSmall() {

    }

    public RobotSmall(String name, String version, boolean small) {
        super(name, version);
        this.small = small;

    }
}
