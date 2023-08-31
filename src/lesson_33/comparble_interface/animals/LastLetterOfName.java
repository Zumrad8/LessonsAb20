package lesson_33.comparble_interface.animals;


import java.util.Comparator;

public class LastLetterOfName implements Comparator <Animal>{
    public int compare(Animal a1, Animal a2) {
        return a1.getName().substring(a1.getName().length()-1).compareTo(a2.getName().substring(a2.getName().length()-1));
    }
}
