package lesson_33.comparble_interface.animals;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMainTest {
    Animal animal1 = new Animal("Wolf",15,"gray");
    Animal animal2 = new Animal("Bear",80,"brown");
    Animal animal3 = new Animal("Fox",12,"gray");
    Animal animal4 = new Animal("Elephant",150,"blue");
    Animal animal5 = new Animal("Anaconda",10,"yellow");

    Animal[] animals = {animal1,animal2,animal3,animal4,animal5};

    @Test
    void testComparatorName() {
        AnimalNameComparator animalNameComparator = new AnimalNameComparator();

        assertTrue(animalNameComparator.compare(animal1,animal2) >0);

    }
    @Test
    void testComparatorWeight() {
        AnimalWeightComparator animalWeightComparator = new AnimalWeightComparator();
         assertFalse(animalWeightComparator.compare(animal1,animal2)>0);
    }
/*
    void testComparatorLastLetter() {
        LastLetterOfName lastLetterOfName = new LastLetterOfName();
        assertFalse(lastLetterOfName.compare(animal1,animal2)>);
    }

 */

}