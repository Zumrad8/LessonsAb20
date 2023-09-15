package lesson_43_other_maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;
    @BeforeEach
    public void init(){
        homework = new Homework();
    }
    @Test
    public void stringBooleanTestSeveral(){
        String[] words = new String[]{"a", "b", "a", "c","b"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",true);
        expected.put("c",false);

        assertEquals(expected,homework.findTrueFalse2(words));
        assertEquals(expected,homework.findTrueFalse(words));
        assertEquals(expected,homework.findTrueFalse3(words));


    }
    @Test
    public void stringBooleanTestALlFalse(){
        String[] words = new String[]{"a", "b", "c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);

        assertEquals(expected,homework.findTrueFalse2(words));
        assertEquals(expected,homework.findTrueFalse(words));
        assertEquals(expected,homework.findTrueFalse3(words));


    }


}