package oop.lecture9.numbers.counter;

import java.util.*;

/**
 * @author ParseJava on 01.08.2016.
 */
public class NumbersCounter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int length = 1000;

        fillList(list, length);

//        System.out.println(list);

        Map<Integer, Integer> numbers = new HashMap<>();

        countNumbers(list, numbers);

        System.out.println("Numbers calculation = " + numbers);
//        Numbers calculation = {0=111, 1=108, 2=88, 3=112, 4=99, 5=108, 6=78, 7=104, 8=100, 9=92}
    }


    private static void fillList(List<Integer> list, int length) {
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(10));
        }
    }


    private static void countNumbers(List<Integer> list, Map<Integer, Integer> numbers) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            Integer currentValue = numbers.get(next);

            numbers.put(next, (currentValue == null) ? 1 : currentValue + 1);
        }
    }
}
