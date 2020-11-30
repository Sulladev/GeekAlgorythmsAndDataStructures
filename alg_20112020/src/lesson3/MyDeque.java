package lesson3;


public class MyDeque<T> {

    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }


    boolean isFull() {
        return ((begin == 0 && end == size - 1) || begin == end + 1);
    }


    void insertFront(T item) {

        if (isFull()) {
            throw new IllegalStateException();
        }

        if (begin == -1) {
            begin = 0;
            end = 0;
        } else if (begin == 0) {
            begin = size - 1;
        } else {
            begin = begin - 1;
        }

        list[begin] = item;
    }

    void insertRear(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        if (end == -1) {
            end = 0;
            end = 0;
        } else if (end == size - 1) {
            end = 0;
        } else {
            end = end + 1;
        }

        list[end] = item;
    }


}
