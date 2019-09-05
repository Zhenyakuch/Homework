/*
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
*/

import java.util.Random;

public class RandomRevert {
    public static void main(String[] args) {
        Random random = new Random();
        int m[] = new int[10];

        for (int i = 0; i <m.length ; i++) {
            m[i] = random.nextInt(999) + 1;
            System.out.print(" " + m[i]);
        }
        System.out.println();
        int temp;
        int n = m.length;
        for (int i=m.length-1; i>=0; --i) {
          System.out.print(" " + m[i]);

        }


    }
}
