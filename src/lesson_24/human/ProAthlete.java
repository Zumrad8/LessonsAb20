package lesson_24.human;

public class ProAthlete extends Human {

    @Override
    public void run() {
        System.out.println("Я, спортсмен - профи, бегу со скоростью " + getSpeed() + " км");
        System.out.println("Я устал, мне нужно отдохнуть " + getRestTime() + " минут");
    }

}
