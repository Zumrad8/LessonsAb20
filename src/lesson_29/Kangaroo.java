package lesson_29;

public class Kangaroo implements Movable {
    @Override
    public void move() {
        System.out.println("Kangaroo can run fast and jump high");
    }

    @Override
    public void stop() {
        System.out.println("Kangaroo can stop without falling");

    }
    public String toString(){
        return "Kangaroo";
    }
}
