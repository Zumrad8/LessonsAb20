package lesson_24;

import lesson_23.BusDriver;

public class MainHW23 {
    public static void main(String[] args) {

        BusDriver driver = new BusDriver("Bob", 33);
        System.out.println(driver.toString());

        driver.addCategories("C");
        driver.addCategories("D");
        System.out.println(driver.toString());
    }
}
