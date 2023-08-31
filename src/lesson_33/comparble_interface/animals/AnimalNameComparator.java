package lesson_33.comparble_interface.animals;
import java.util.Comparator;


public class AnimalNameComparator implements Comparator<Animal> {
     public int compare(Animal a1, Animal a2) {
         return a1.getName().compareTo(a2.getName());
     }

}


