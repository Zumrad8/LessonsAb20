package human;

public class MainRun {
    public static void main(String[] args) {


        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProAthlete proAthlete = new ProAthlete();

        human.run("обычный человек" , 10);
        amateurAthlete.run("спортсмен-любитель",15);
        proAthlete.run("спортсмен-профи",25);


    }
}
