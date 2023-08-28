package lesson_24.human;

public class AmateurAthlete extends Human {
    private int speed = 15;
    private int restTime = 10;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getRestTime() {
        return restTime;
    }

    @Override
    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    @Override
    public void run() {
        System.out.println("Я, спортсмен - любитель, бегу со скоростью " + speed + " км");
        System.out.println("Я устал, мне нужно отдохнуть " + restTime + " минут");
    }
}
