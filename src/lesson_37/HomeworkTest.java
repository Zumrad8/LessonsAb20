package lesson_37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {
    Homework homework;
    @BeforeEach
    public void setUp(){
        homework = new Homework();
    }
    @Test
    public void shortestOrLongestTest_oneElement(){
        assertEquals("a",homework.findShortestOrLongest(Arrays.asList("a")));
    }
    public void shortestOrLongestTest_shortFirst(){
        assertEquals("a",homework.findShortestOrLongest(Arrays.asList("bb","a","ddd")));
    }


}