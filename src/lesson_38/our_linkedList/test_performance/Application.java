package lesson_38.our_linkedList.test_performance;

public class Application {

    public static void main(String[] args) {


        ListOperationStrategy arrayStrategy = new ArrayListOperationsStrategy();

        ListOperationStrategy linkedStrategy = new LinkedListOperationsStrategy();

        ListPerformanceTester arrayTester = new ListPerformanceTester(arrayStrategy);
        ListPerformanceTester linkedTester = new ListPerformanceTester(linkedStrategy);

        System.out.println("Test add performance");

        System.out.println(arrayTester.testAddPerformance(10000000));
        System.out.println(linkedTester.testAddPerformance(10000000));

        System.out.println("Test get performance");

        System.out.println(arrayTester.testGetPerformance(1000000,1000));
        System.out.println(linkedTester.testGetPerformance(1000000,1000));
    }


}
