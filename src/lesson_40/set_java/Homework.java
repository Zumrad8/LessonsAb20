package lesson_40.set_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {
    /*
     1. С помощью множеств реализовать метод, который принимает
        лист имен и возвращает лист без повторяющихся элементов
     */
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Kate");
        names.add("Bob");
        names.add("Kate");
        names.add("Ann");
        names.add("Bob");
        names.add("Jack");

        //List<String> newNames = deleteDuplicate(names);

       //System.out.println(newNames);



        List<String> newNames = getDuplicates(names);
        System.out.println(newNames);




    }

    public static List<String> deleteDuplicate(List<String> names) {
        Set<String> set = new HashSet<>(names);
        return new ArrayList<>(set);

    }
     /*
     2. Написать метод, который принимает лист имен, в котором имена могут повторяться и возвращает лист повторяющихся
        элементов
        "John","Peter","Mary","Ann","John","Peter" -> John, Peter
        List<String> getDuplicates (List<String> input)
      */

    public static List<String> getDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String>duplicates = new ArrayList<>();

        for (String s : input) {
            if(!set.add(s) && !duplicates.contains(s))
                duplicates.add(s);

        }

        return duplicates;


    }
}
