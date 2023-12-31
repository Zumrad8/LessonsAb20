package lesson_38.our_linkedList.test_performance;

import java.util.List;

public class ListPerformanceTester {
    private final ListOperationStrategy strategy;

    public ListPerformanceTester(ListOperationStrategy strategy) {
        this.strategy = strategy;
    }

    public long testAddPerformance(int nTimes){
        long now = System.currentTimeMillis();
        strategy.append(nTimes);
        return System.currentTimeMillis() - now;
    }
    public long testGetPerformance(int nTimes, int length){
        List list = strategy.getFilledList(length);

        long now = System.currentTimeMillis();
        strategy.get(nTimes, list);

        return System.currentTimeMillis() - now;

    }
}
