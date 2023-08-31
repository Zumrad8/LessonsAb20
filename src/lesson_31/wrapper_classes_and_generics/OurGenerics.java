package lesson_31.wrapper_classes_and_generics;


public class OurGenerics {

    /*
    Обобщение, Дженерики Generics,
    Дженерики позволяют не указывать конкретный тип, который будет использоваться.
    Поэтому мы можем указать, что класс является обобщенным с помощью т.Н. универсального параметра в угловых
    скобках после имени класса. Вместо этого параметра впоследствии можно подставить любой тип


     */
    public static void main(String[] args) {
        Person<Integer> john = new Person<>("John", 35);
        System.out.println(john.getName());
        System.out.println(john.getAge());

        Person<String> bill = new Person<>("Bill", "forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());


        // Обобщенные методы

        Printer printer = new Printer();
        Integer[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"a", "b", "c",};

        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        // Обобщенные интерфейсы

        // несколько универсальных параметров

        Person2<Integer,String> ann = new Person2<>("Ann", 23);
        System.out.println();


    }

}
