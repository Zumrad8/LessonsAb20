package lesson_24.paper;

public class Pencil extends Pen{

    @Override
    public void draw(String figure) {
        System.out.println("Карандаш рисует " + figure);
    }

}
