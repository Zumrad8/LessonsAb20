package lesson_21;

import java.util.Arrays;
import java.util.Random;

public class Lesson21 {

    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 3, 10, 5, 0, 87, 99, 38, 57, 2, 77};

        System.out.println(ints.length);

        System.out.println(ArraysUtil.linealSearch(ints, 77));

        System.out.println("До сортировки");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("После сортировки");
        System.out.println(Arrays.toString(ints));


        int numberForSearch = 41;
        int idx = ArraysUtil.binarySearch(ints, numberForSearch);
        System.out.println("Индекс числа " + numberForSearch + " = " + idx) ;

        int[] testArray = new int[10000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(1000);
        }
        ArraysUtil.sortSelection(testArray);

        numberForSearch = 970;
        idx = ArraysUtil.binarySearch(testArray, numberForSearch);
        System.out.println("Индекс числа " + numberForSearch + " = " + idx);

        ArraysUtil.printArray(ints);












    }
}
