package lesson_33.comparble_interface.animals;

import java.util.Arrays;

public class AnimalMain {
    /*
    Создать класс Animal с полями name, weight, color.
    Используя компараторы вывести на экран список животных, упорядоченный по:
    1. имени
    2. по весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени

    Wolf, Bear, Fox, Elephant, Anaconda

    для 1 пункта:
    name Anaconda, weight 500, color yellow
    -----------
    --------

    для 3 пункта:
    Anaconda
    Wolf
    Bear
    Elephant
    Fox

    Протестировать правильность работы компаратора
     */

    public static void main(String[] args) {
        Animal animal1 = new Animal("Wolf",15,"gray");
        Animal animal2 = new Animal("Bear",80,"brown");
        Animal animal3 = new Animal("Fox",12,"gray");
        Animal animal4 = new Animal("Elephant",150,"blue");
        Animal animal5 = new Animal("Anaconda",10,"yellow");

        Animal[] animals = {animal1,animal2,animal3,animal4,animal5};

        System.out.println("Before sort");
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println();
        System.out.println("Sort by animals' name");
        Arrays.sort(animals, new AnimalNameComparator());
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println();
        System.out.println("Sort by animals' weight");
        Arrays.sort(animals, new AnimalWeightComparator());
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println();
        System.out.println("Sort by last letter of animal' name");
        Arrays.sort(animals, new LastLetterOfName());
        for (Animal animal : animals)
            System.out.println(animal);

    }



}
