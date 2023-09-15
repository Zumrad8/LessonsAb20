package lesson_40.set_java.equals_hashcode;

public class Main {
    public static void main(String[] args) {


        Order o1 = new Order(1, "order1");
        Order o2 = new Order(1, "order1");
        Order o3 = new Order(1, "order2");


        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());

    }
    /*
    equals() contract  (правила)
     1. reflexive - объект должен быть равен самому себе
     2. symmetric - x.equals(y) должен возвращать тот же результат, что и y.equals(x)
     3. transitive - если x.equals(y) и y.equals(z) то x.equals(z)
     4. consistent - значения equals() меняется только если изменяться значения содержащиеся в нем



    HashCode
     Хешкод - это целое число, которое генерируется с помощью алгоритма хеширования.

     hashCode() contract

     1. При вызове на одном и том же объекте несколько раз во время выполнения программы hashCode() должен возвращать
        одно и то же значение, при условии, что значения полей не менялись. При этом сами значения необязательно должны
        оставаться неизменными при нескольких вызовах программы.
     2. Если два объекта равны в соответствии с equals(), то их хешкоды также должны быть одинаковы.
     3. Если два объекта не равны по equals() то вызов метода hashCode() для них не обязательно должен давать разные значения

     Бинарные деревья

     Структуры данных, которая строится по следующим правилам:
     1. Каждый узел имеет не более двух детей
     2. Каждое значение меньшее значения узла станет левым ребенком или ребенком левого ребенка
     3. Каждое значение большее или равное значение узла станет правым ребенком или ребенком правого ребенка

     */
}
