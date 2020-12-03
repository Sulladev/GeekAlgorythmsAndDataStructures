package lesson3;


import java.util.NoSuchElementException;

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
            begin = 0;
            end = 0;
        } else if (end == size - 1) {
            end = 0;
        } else {
            end = end + 1;
        }
        list[end] = item;
    }


    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }


    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[end];
    }

    void removeFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (begin == end) {
            begin = -1;
            end = -1;
        } else {
            if (begin == size - 1) {
                begin = 0;
            } else {
                begin = begin + 1;
            }
        }
    }


    void removeRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (begin == end) {
            begin = -1;
            end = -1;
        } else if (end == 0) {
            end = size - 1;
        } else {
            end = end - 1;
        }

    }


    boolean isFull() {
        return ((begin == 0 && end == size - 1) || begin == end + 1);
    }

    boolean isEmpty() {
        return (begin == -1);
    }


}
