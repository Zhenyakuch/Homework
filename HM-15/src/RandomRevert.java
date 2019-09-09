/*
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
*/

import java.util.Random;

public class RandomRevert {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(6) + 14];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
