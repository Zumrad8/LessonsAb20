package lesson_23;

public class Bus {

    private int id;
    private String model;
    private int capacity;
    private BusDriver driver; //null
    static private int counterForId;
    private final AutoPilotBus autoPilotBus;


    public Bus (String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.autoPilotBus = new AutoPilotBus("AP-001");
        this.id = counterForId++;
    }
    public Bus (String model, int capacity, BusDriver driver) {
        this(model, capacity);
        this.driver = driver;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getCounterForId() {
        return counterForId;
    }

    public static void setCounterForId(int counterForId) {
        Bus.counterForId = counterForId;
    }
    public String toString() {
        return "{id: " + id + "; model: " + model +
                "; driver " + (driver == null ? "no driver " : driver.toString()) + "}";
    }
    public void moveByDriver() { // автобус начинает движение
        //Водителю автобуса передается команда начать управление автобусом
        driver.driveBus(); // в методе водител/ передается
    }
    public void moveByAutopilot() {
       // autoPilotBus.driveBus;
    }
}
