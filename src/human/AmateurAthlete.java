package human;

public class AmateurAthlete extends Human {
    @Override
    public void run(String human, int speed, int restTime) {
        System.out.println("Я, " + human + " бегу со скоростью " + speed + " км");

    }
}
