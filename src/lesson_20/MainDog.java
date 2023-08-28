package lesson_20;

public class MainDog {
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2("Dog1", 100);
        Dog2 dog3 = new Dog2("Dog3", 100);

        dog1.whoAmI();
        System.out.println(dog1.getName() + ", Мой макс прыжок " + dog1.getJumpHeight());

        dog3.whoAmI();
        System.out.println(dog3.getName() + ", Мой макс прыжок " + dog3.getJumpHeight());

        dog1.getBarrier(100);
        dog3.getBarrier(150);

        System.out.println();
        System.out.println("Все собаки совершили " +  Dog2.getTotalJumpCounter() + " прыжков");




    }
}
