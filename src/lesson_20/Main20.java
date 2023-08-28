package lesson_20;

public class Main20 {
    int noStatic = 10;
    static int staticInt = 20;
    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Seat", 110);
        Car car2= new Car("Skoda", 120);

        System.out.println("Всего создано машин: " + Car.numberOfCars);
        Car.showStaticInfo();


        System.out.println("================");

        staticInt++;
        test();
    }
    static void test() {
        staticInt++;
    }
    public void testNotStatic() {
        staticInt++;
        noStatic++;
        test();

    }


}
