package lesson_20;

import java.util.Arrays;

public class RubberArray {

   private int[] array;
   int cursor;
   static final int MULTIPLIER = 2;

    public RubberArray() { // конструктор
        this.array = new int[10];
        cursor = 0;

    }

    public RubberArray(int[] arr) {
        this.array = Arrays.copyOf(arr, arr.length);

        //this(); // this.array = new int[];
        // add(arr);

    }

    public void add(int value) {// добавление 1 элемента
        if (isArrayFull()) {
            extractArray();
        }
        array[array.length - 1] = value;

    }
    private boolean isArrayFull() {
        return cursor == array.length -1;
    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);

        }

    }

    private void extractArray() { // расширение массива на 1 ячейку
        System.out.println("Расширяем внутренний массив! ");
        array = Arrays.copyOf(array, array.length * MULTIPLIER);
    }

    public void printArray() { // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < cursor; i++) {
            System.out.print(array[i]);
            if (i < cursor - 1) {
                System.out.print("; ");
            }

        }
        System.out.print("]");
        System.out.println();

    }
    public void printFullArray() { // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }

        }
        System.out.print("]");
        System.out.println();

    }

    public int size() { // количество элементов в массиве
        return cursor;
    }
    public int length() {
        return array.length;
    }

    public int sumOfValue() { // сумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // TODO переписать
    public int min() { // возвращаем мин значение из массива
        if (cursor == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
    // TODO переписать
    public int max() { // возвращаем макс значение из массива
        if (cursor == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public int[] toArray() { // нужно создать КОПИЮ нашего массива и ее вернуть
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];

        }
        return result;
        // return Arrays.copyOf(array, array.length);

    }

    public void deleteByIndex(int index) { // удалить элемент по индексу
        if (cursor >= 1 && index >= 0 && index < cursor) {

           // int[] result = new int[array.length - 1];

            for (int i = 0; i < cursor; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
        }


    }

    public int searchValueByIndex(int index) { // Возвращение значения по индексу
        if (isIndexIncorrect(index)) {
            return Integer.MIN_VALUE;
        }
        return array[index];
    }

    public int searchElementByValue(int value) { //Поиск элемента по значению
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public boolean deleteByValue (int value) { // Удаление элемента по значению
        System.out.println("Start delete by value! ");
        int indexByValue = searchElementByValue(value);
        if (indexByValue < 0) return false;
        deleteByIndex(indexByValue);

        return  true;

    }
    public int deleteAllByValue(int value) { // Поиск и удаление ВСЕХ элементов по значению x;
        int count = 0;

        //Пытаемся найти значение в массиве. Если находим -> удаляем и возвращаем true.
        // Входим в тело while, если находим, возвращаем false. Выходим из цикла while

        while (deleteByValue(value)) {
            count++;
        }
        return count;

    }

    public boolean swapValueByIndex (int index, int newValue) { //Замена значения по индексу (есть индекс и новое значение)
        if(isIndexIncorrect(index)) {
            return false;
        }
        array[index]= newValue;
        return true;

    }

    private boolean isIndexIncorrect(int index) {
        return !(index >= 0 && index < cursor);
    }





}



/*
+ добавление сразу нескольких значений в массив
- сортировать ???
+ найти мин, макс
- заменить по индексу значение в массиве
+ сумма элементов массива
+ количество элементов в массиве
+ удалить элемент по индексу
- среднее значение ???
+ поиск элемента по значению
- распечатать в обратной последовательности -> ???
+ получить RubberyArray в виде обычного массива
+ удалить элемент по значению
 */
