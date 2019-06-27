package main.java.robots;

public class RobotStrong {

    private String name;
    private String version;

    public RobotStrong() {

    }

    public RobotStrong(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void speak() {
        System.out.println("Robot: " + name + " speaks");

    }
    public void walk (){
        System.out.println("Robot: "+ name + "runs every morning");
    }
    public void shoot (){
        System.out.println("Robot: "+ name + "bah-bah");
    }
    public  void showVersion (){
        System.out.println("Robot ver. is: "+ version);
    }
}
