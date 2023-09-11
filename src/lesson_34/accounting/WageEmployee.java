package lesson_34.accounting;

public class WageEmployee extends Employee {

    private double wage;
    public WageEmployee(int id, String name, String surname, double hour, double wage) {
        super(id,name,surname,hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        double salary = getWorkedHours()*wage;
        if (salary <= getWorkedHours()*StateConstants.MIN_WAGE){
            salary = getWorkedHours() * StateConstants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}' + super.toString();
    }
}
