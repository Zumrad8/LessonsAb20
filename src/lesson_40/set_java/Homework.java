package lesson_40.set_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {
     /*
      С помощью множеств реализовать метод, который принимает
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

         List<String> newNames = deleteDuplicate(names);

         System.out.println(newNames);


     }

     public static List<String> deleteDuplicate(List<String> names){
         Set<String> set = new HashSet<>(names);
         return new ArrayList<>(set);

     }



}
