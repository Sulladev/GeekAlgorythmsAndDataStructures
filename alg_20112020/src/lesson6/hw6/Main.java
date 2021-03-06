package lesson6.hw6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int countTree = 100000;
        int balCount = 0;

        for (int i = 0; i < countTree; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while (map.high() < 6) {
                x = random.nextInt(201) - 100;
                map.put(x, x);
            }
            map.delete(x);
            if (map.isBalanced()) {
                balCount++;
            }
        }
        System.out.println("balCount " + balCount + " countTree " + countTree);
        System.out.println("balanced " + (double) balCount / countTree * 100 + " %");
        System.out.println("no balanced " + (double) (countTree - balCount) / countTree * 100 + " %");


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
