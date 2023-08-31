package lesson_32.unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {
    /*
    test cases
    1. массив пустой
    2. в массиве один элемент
    3. в массиве два элемента
    4. в массиве из нескольких элементов максимальный находится в середине
    5. в массиве из нескольких элементов максимальный первый
    6. в массиве из нескольких элементов максимальный последний
     */

    private MaxNumber m = new MaxNumber();
    @Test
    public void zeroElement_test(){
        int[] actual = {};

        assertEquals(-1,m.findMax(actual));
    }
    @Test
    public void oneElement_test(){
        int[] actual = {2};
        assertEquals(2,m.findMax(actual));
    }
    @Test
    public void twoElement_test(){
        int[] actual = {2,2};
        assertEquals(2,m.findMax(actual));
    }
    @Test
    public void severalElement_middle_test(){
        int[] actual = {2,4,7,9,3,1,5};
        assertEquals(9,m.findMax(actual));
    }
    @Test
    public void severalElement_first_test(){
        int[] actual = {9,2,3,8,5,1,2};
        assertEquals(9,m.findMax(actual));
    }
    @Test
    public void severalElement_end_test(){
        int[] actual = {9,2,3,8,5,1,2,15};
        assertEquals(15,m.findMax(actual));
    }


}