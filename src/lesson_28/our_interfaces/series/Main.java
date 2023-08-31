package lesson_28.our_interfaces.series;

public class Main {
    public static void main(String[] args) {

        Twice twice = new Twice();

        for (int i = 0; i < 10; i++) {
            System.out.println("next value is " + twice.getNext());

        }
        System.out.println();
        System.out.println("Reset value");
        twice.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("next value is " + twice.getNext());

        }

        System.out.println();
        System.out.println("Start at 10");
        twice.setStart(10);

    }
}
