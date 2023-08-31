package lesson_32.unit_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach // этот метод будет выполняться перед каждым тестовым методом
    public void setUp(){
        calculator = new Calculator();
    }
    @Test // это тестовый метод
    @DisplayName("Simple multiplication 2 * 3 = 6 should be correct") // можно использовать для определения имени метода
    void testMultiply(){
    assertEquals(6, calculator.multiply(2,3)); // выражение, которое и определяет равенство ожидаемого и
                                                             // фактического значения
    }
    @Test
    @DisplayName("Check correct handling of zero")
    void testMultiplyZero(){

        assertEquals(0,calculator.multiply(0,3));
        assertEquals(0,calculator.multiply(5,0));


    }

}