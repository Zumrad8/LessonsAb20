package lesson_23;

public class AutoPilotBus {
    private final int id;
    private String model;
    private  Bus bus;
    private boolean isActive;
    static int counter;


    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Bus getBus() {
        return bus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        AutoPilotBus.counter = counter;
    }
    public void turnOff() {
        isActive = false;
        System.out.println("Автопилот " + id + " выключен");
    }
   public void turnOn() {
        isActive = true;
       System.out.println("Автопилот " + id +  " выключен");
   }

    public AutoPilotBus(String model) {
        this.model = model;
        this.id = counter++;
    }

    public String toString() {
        return "{id: " + id + "; model:" + model + "; встроен в автобус id: " + bus.getId() + "}";
    }
}
