package lesson_40.set_java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {
    private Homework homework;
    public void setUp(){
        homework = new Homework();
    }
    @Test
    public void deleteDuplicateOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected, homework.deleteDuplicate(actual));

    }
    @Test
    public void deleteDuplicateNoElement(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann");
        List<String> expected = Arrays.asList("Ann","John","Peter","Mary");

        assertEquals(expected, homework.deleteDuplicate(actual));

    }
    @Test
    public void deleteDuplicateN(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann","John","Peter");
        List<String> expected = Arrays.asList("Ann","John","Peter","Mary");


        assertEquals(expected, homework.deleteDuplicate(actual));

    }
    @Test
    public void getDuplicateOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();

        assertEquals(expected, homework.getDuplicates(actual));

    }
    @Test
    public void getDuplicateNoDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill");
        List<String> expected = Arrays.asList();

        assertEquals(expected, homework.getDuplicates(actual));

    }
    @Test
    public void getDuplicateOneDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill","Ann", "Bill");
        List<String> expected = Arrays.asList("Ann", "Bill");

        assertEquals(expected, homework.getDuplicates(actual));

    }
    @Test
    public void getDuplicateManyDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill","Ann", "Bill", "Ann","Ann", "Bill");
        List<String> expected = Arrays.asList("Ann", "Bill");

        assertEquals(expected, homework.getDuplicates(actual));

    }


}