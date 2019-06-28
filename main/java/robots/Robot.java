package main.java.robots;

public interface Robot {

    default  void fly (){
        System.out.println("I can fly");

    }

    default  void swim (){
        System.out.println("I can swim");

    }

    default  void getSunProtect (){
        System.out.println("I can protected from sun");

    }


}
