package lesson_28.our_interfaces;

public class Main {

    // Интерфейс в джава
    /*
    public interface MyInterface{
    returnType method-name (param-list);
    returnType method-name2 (param-list);


    }
     */
    public static void main(String[] args) {
        Movable car = new Car();
        Car car1 = new Car();
        car.canMove();
    }

}
