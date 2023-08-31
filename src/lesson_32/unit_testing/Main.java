package lesson_32.unit_testing;

public class Main {
    /*
    Юнит Тестирование JUnit5

    Тестирование - это когда один программный код запускает другой с целью проверки его функционирования на
    соответствие ожидаемому результату.

    Виды тестирования:

    unit тестирование - тестирование отдельных метод.

    integration testing - проверяется, работает ли вся система или какой-то ее компонент в соответствии
    с ожиданиями.

    performance test - проверка эффективности работы системы при высокой нагрузке.

    JUnit 5

    Платформа JUnit
    JUnit Jupiter
    JUnit Vintage

    Для тестирования методов какого либо класса обычно создается отдельный тестовый класс, который принято
    называть по имени тестируемого класса прибавляя в конце слово Test

    @Override - аннотация

    Несколько аннотации JUnit:
    @BeforeEach - метод будет запускаться перед каждым тестовым методом
    @DisplayName - может использоваться для определения имени теста
    @Test - становится тестовым методом
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(2,3));
        System.out.println(calculator.multiply(0,3));
        System.out.println(calculator.multiply(2,0));

        System.out.println(Circle.compareNumbers(5,3));


    }
}
