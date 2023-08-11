package lesson_20;

import java.util.Arrays;

public class RubberArray {

    int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];

    }

    public RubberArray(int[] arr) {
        this(); // new RubberArray();
        add(arr);

    }

    public void add(int value) { // добавление 1 элемента
        extractArray();
        array[array.length - 1] = value;

    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);

        }

    }

    public void extractArray() { // расширение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { // вывести в консоль массив
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
        return array.length;
    }

    public int sumOfValue() { // сумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;

    }

    public int max() { // возвращаем макс значение из массива
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
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
        if (array.length >= 1 && index >= 0 && index < array.length) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];

                } else { // if (i >= index)

                    result[i] = array[i + 1];

                }

            }
            // System.out.println("Result " + Arrays.toString(result));
            array = result;
        }


    }

    public int searchValueByIndex(int index) { // Возвращение значения по индексу
        if (index < 0 || index > array.length -1) {
            return -1;
        }
        return array[index];
    }

    public int searchElementByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public void deleteByValue (int value) { // Удаление элемента по значению

        int index = searchElementByValue(value);
        if (index >= 0){
            deleteByIndex(index);
        }

    }

    public void swapValueByIndex (int index, int newValue) { //Замена значения по индексу (есть индекс и новое значение)
        if(index >= 0 && index < array.length -1) {
            array[index] = newValue;
        }
    }

    public void swapValueToValue (int oldValue, int newValue) {


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
