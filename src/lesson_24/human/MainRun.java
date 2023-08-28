package lesson_24.human;

public class MainRun {
    public static void main(String[] args) {
        Human human = new Human();
        Human amateurAthlete = new AmateurAthlete();
        Human proAthlete = new ProAthlete();

        human.run();
        amateurAthlete.run();
        proAthlete.run();
    }
}
