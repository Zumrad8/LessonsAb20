package lesson_31.wrapper_classes_and_generics;

public class Person2<T, N> {
    private N name;
    private T age;

    public Person2(N name, T age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
}
