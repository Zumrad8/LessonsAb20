package lesson_26.pizza_factory;

public class PizzaHawaii extends Pizza {
    private static String TYPE = "PizzaHawaii";
    public PizzaHawaii() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with pineapple");

    }
}
