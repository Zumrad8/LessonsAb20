package lesson_33.comparble_interface.animals;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getWeight(), a2.getWeight());
    }
}
