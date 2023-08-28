package lesson_24.human;

public class Human {
    private int speed = 10;
    private int restTime = 15;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public void run() {
        System.out.println("Я, обычный человек, бегу со скоростью " + speed + " км");
        System.out.println("Я устал, мне нужно отдохнуть " + restTime + " минут");
    }



}
