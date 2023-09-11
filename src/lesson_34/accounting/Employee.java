package lesson_34.accounting;

public abstract class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private double workedHours;

    public Employee(int id, String name, String surname, double workedHours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workedHours=" + workedHours +
                '}';
    }
    // Программы также должна содержать методы, предоставляющие возможность сортировки списка сотрудников по следующим критериям;
    //    - по фамилии
    public int compareTo(Employee e){
        return getSurname().compareTo(e.getSurname());
    }
}
