package lesson_28.our_interfaces;

public class Car implements Movable,Breakable{

    @Override
    public void canMove() {
        System.out.println("A car can drive");
    }
    @Override
    public void canBreak(){
        System.out.println("A car can break");
    }
}
