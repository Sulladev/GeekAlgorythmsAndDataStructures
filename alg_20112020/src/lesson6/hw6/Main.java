package lesson6.hw6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i < 3; i++) {
//            MyTreeMap<Integer, Integer> map  = new MyTreeMap<>();
//            for (int j = 0; j < 7; j++) {
//                Integer key = random.nextInt(201) - 100;
//                map.put(key, key);
//            }
//            System.out.println(map);
//            System.out.println(map.size());
//            System.out.println(map.high());
//            System.out.println(map.isBalanced());
//        }

        MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.high());
        System.out.println(map.isBalanced());
    }
}
