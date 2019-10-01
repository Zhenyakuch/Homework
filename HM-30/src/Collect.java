/*
        Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
        числа.
*/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list_linked = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list_linked.add(random.nextInt(5 + 10));
            System.out.print(list_linked.get(i) + " ");
        }
        System.out.println();
        System.out.println("delete dublicate");

        HashSet<Integer> hash = new HashSet<>(list_linked);
        System.out.print(hash + " ");



    }
}
