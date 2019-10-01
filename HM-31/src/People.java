/*
        Создать список оценок учеников с помощью ArryList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

    public static int max = 0;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 10 + 1);
            Integer b = new Integer(a);
            list.add(i, b);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer value = (Integer) iterator.next();
            if (value>=value+1){
                max=value;
            }

            System.out.print(value + " ");
            System.out.println("!!!!!!!"+max);

        }

    }

}
