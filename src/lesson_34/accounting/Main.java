package lesson_34.accounting;

public class Main {
    /*
    Написать программу для бухгалтерии.
    Программа должна уметь:
    - добавлять сотрудников в штат
    - удалять сотрудников из штата
    - рассчитывать зарплату для двух категорий сотрудников
                         - сотрудник с почасовой оплатой
                         - менеджер по продажам
    У программы должны быть следующие классы:
    - Компания, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран
      списка всех сотрудников и метод для суммирования зарплат всех сотрудников
    - классы сотрудников
      - abstract Employee
      - WageEmployee
      - SalesManager
    У сотрудников должны быть такие поля: id, name, surname, количество проработанных часов. Также должен быть метод
    подсчета зарплаты.
    У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
    минимальный размер оплаты труда.
    У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается, как процент от объема продаж.
    Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда.

    Дополнительно:
    Программы также должна содержать методы, предоставляющие возможность сортировки списка сотрудников по следующим критериям;
    - по фамилии
    - по id
    - по имени, а если имена одинаковые, то по id

     */
    public static void main(String[] args) {
        Employee sm1 = new SalesManager(7,"Ben","White",80,100000,0.5);
        Employee wm1 = new WageEmployee(1,"Jack","Red",30,12.5);
        Employee sm2 = new SalesManager(3,"Ben","Brown",75,120000,0.5);
        Employee wm2 = new WageEmployee(1,"Ann","Green",35,12.5);
        Employee sm3 = new SalesManager(35,"Mary","Claw",85,110000,0.5);

        System.out.println(sm1.calculateSalary());
        System.out.println(wm1.calculateSalary());

        Company company = new Company(5);
        company.addEmployee(sm1);
        company.addEmployee(wm1);
        company.addEmployee(sm2);
        company.addEmployee(wm2);
        company.addEmployee(sm3);

        company.display();


        System.out.println("-------remove sm1-------------");
        company.removeEmployee(sm1);
        company.display();

        company.addEmployee(sm1);


        System.out.println("Total salary = " + company.sumSalary());

        System.out.println("Employees sorted by second name: ");
        company.sortEmployees();
       // company.display();





    }
}
