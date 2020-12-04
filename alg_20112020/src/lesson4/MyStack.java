package lesson4;

import java.util.EmptyStackException;

public class MyStack <T> {

    private int size;

    private MyLinkedList<T> stack= new MyLinkedList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return size == stack.size();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
    }

    public T pop() {
        T temp = peek();
        stack.removeLast();
        return temp;
    }

    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        stack.insertLast(item);
    }


}
