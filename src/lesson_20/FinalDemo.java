package lesson_20;

public class FinalDemo {

    public static void main(String[] args) {
       final  int x; // финальное значение
       final int[] ints = {0, 23, 45, 42, 45};

        x = 10;
       // x = 5; // не могу поменять значение

       // ints = new int[5];

        ints[0] = 0;
        ints[1] = 1;
        ints[0] = 5;
        ints[1] = ints[0] + 15;

       // ints = new int[7];  // не могу присвоить ссылку на другой обьект
    }
}
