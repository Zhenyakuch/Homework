/*
        Создать список оценок учеников с помощью ArrayList, заполнить случайными
        оценками. Удалить неудовлетворительные оценки из списка.
*/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class List_people {

    static List<Integer> list = new ArrayList<Integer>(20);
    static Random rand = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(1 + 10));
            System.out.print(list.get(i) + "  ");
        }

        System.out.println();
        System.out.println("неудовлетворительные оценки удалены");
        for (int i = 0; i < list.size(); i++) {
                list.remove(Integer.valueOf("0"));
                list.remove(Integer.valueOf("1"));
                list.remove(Integer.valueOf("2"));
                list.remove(Integer.valueOf("3"));

            System.out.print(list.get(i) + "  ");
        }

    }
}


