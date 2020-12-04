package lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(11);
        list.add(50);
        list.add(0);

        ListIterator<Integer> iterator = list.listIterator();
    }
}
