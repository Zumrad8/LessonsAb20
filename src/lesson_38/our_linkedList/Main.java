package lesson_38.our_linkedList;
import java.util.List;

import java.util.LinkedList;

public class Main {

    /*
    LINKEDLIST
    конструкторы:

    LinkedList() - пустой список
    LinkedList ( Collection collection) - список со всеми элементами коллекции collection

    LinkedList methods методы отличающиеся от ArrayList
    - addFirst() / offerFirst() - добавляет элт в начало листа
    - addLast() / offerLast() - добавляет последний
    - removeFirst() / pollFirst() - удаляет первый элт из начала
    - removeLast() / pollLast() - удаляет последний
    - getFirst() / peekFirst() - получить первый
    - getLast() / peekLast() - получить последний

     */
    public static void main(String[] args) {
       // LinkedList<Integer> list = new LinkedList<>();
        //List<String> list1 = new LinkedList<>();

        List<String>strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        names.addFirst("Ann");
        System.out.println(names);

        names.removeFirst();
        System.out.println(names);

        names.peekFirst();
        System.out.println(names.peekFirst());




    }

}
