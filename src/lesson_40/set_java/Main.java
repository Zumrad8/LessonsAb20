package lesson_40.set_java;

import java.util.*;

public class Main {
    // Set
    /*
    Set - это коллекция, которая не может содержать дубликатов

     HashSet
     1. HashSet использует в основе HashTable
     2. Не гарантирует порядка, в котором хранятся и возвращаются элементы
     3. Не допускает дубликатов
     4. Можно поместить null

     */
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        // добавление элемента
        System.out.println(hashSet.add("aa"));
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");

        System.out.println(hashSet);

        for (String s : hashSet) {
            System.out.println(s);
        }
        // добавление элемента
        System.out.println(hashSet.add("aa"));
        System.out.println(hashSet.add("bb"));
        System.out.println(hashSet);

        // удалить элемент remove()

        hashSet.remove("bb");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aa"));

        System.out.println(hashSet.isEmpty());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> nameSet = new HashSet<>();
        nameSet.add("John");
        nameSet.add("Jack");
        nameSet.add("Ann");
        nameSet.add("Bill");
        System.out.println(nameSet);


        //LinkedHashSet - поддерживает порядок ввода элементов
        System.out.println("LinkedHashSet");
        Set<String> linkedNameSet = new LinkedHashSet<>();
        linkedNameSet.add("John");
        linkedNameSet.add("Jack");
        linkedNameSet.add("Ann");
        linkedNameSet.add("Bill");
        System.out.println(linkedNameSet);


        // TreeSet - сортирует элементы
        System.out.println("with TreeSet");
        Set<String> treeNamesSet = new TreeSet<>();
        treeNamesSet.add("John");
        treeNamesSet.add("Jack");
        treeNamesSet.add("Ann");
        treeNamesSet.add("Bill");
        System.out.println(treeNamesSet);

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        System.out.println(setA);


        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setB);

        // Intersection - пересечение
        Set<Integer> integerSet = new HashSet<>(setA);
        integerSet.retainAll(setB);
        System.out.println(integerSet);


        // union - объединение
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);

        // relative compliment - разница
        Set<Integer> differencesSet = new HashSet<>(setA);
        differencesSet.removeAll(setB);
        System.out.println(differencesSet);




    }
}
