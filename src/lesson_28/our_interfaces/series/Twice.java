package lesson_28.our_interfaces.series;

// создает последовательность чисел, каждое из которых на 2 больше другого

public class Twice implements Series{
    int start;
    int value;
    public Twice(){
        start = 0;
        value = 0;
    }
    public int getNext(){
        value += 2;
        return value;

    }
    public void reset() {
        value = start;
    }
    public void setStart(int a) {
        start = a;
        value = a;

    }
}
