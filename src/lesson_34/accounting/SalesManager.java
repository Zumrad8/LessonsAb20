package lesson_34.accounting;

public class SalesManager extends Employee {
    private double salesVolume;
    private double percent;

    public SalesManager(int id, String name, String surname, double workedHours, double salesVolume, double percent) {
        super(id, name, surname, workedHours);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    @Override
    public double calculateSalary() {
        double salary = salesVolume * percent;
        if (salary < super.getWorkedHours() * StateConstants.MIN_WAGE){
            salary = super.getWorkedHours() * StateConstants.MIN_WAGE;
        }
        return salary;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + salesVolume +
                ", percent=" + percent +
                '}'+ super.toString();
    }
}
