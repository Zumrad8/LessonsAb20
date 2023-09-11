package lesson_38.our_linkedList.linkedlist_implementation;

public interface OurList<E> extends Iterable<E> {

    void append(E o);
    E get(int index);
    void set(E o, int index);
    int size();
    boolean contains(E o);

    boolean remove(E o);

    E removeById(int index);

}
