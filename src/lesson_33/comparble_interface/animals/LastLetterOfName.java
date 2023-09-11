package lesson_33.comparble_interface.animals;


import java.util.Comparator;

public class LastLetterOfName implements Comparator <Animal>{
    public int compare(Animal a1, Animal a2) {
        String animalName1 = a1.getName();
        String animalName2 = a2.getName();
        //return animalName1.charAt(animalName1.length()-1) - animalName2.charAt(animalName2.length()-1);
       return a1.getName().substring(a1.getName().length()-1).compareTo(a2.getName().substring(a2.getName().length()-1));
    }  // еще один вариант
}
