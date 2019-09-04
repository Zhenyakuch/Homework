/*
10. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
11. Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
12. Найдите сумму первых n целых чисел, которые делятся на 3.
*/

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws InterruptedException {
      zadanie_10();
      zadanie_11();
      zadanie_12();
    }
    public static void zadanie_10(){
        int x = 10;
        int y=10;
        for (int i=10; i<=15; i++) {
            y++;
             x*=y;
            System.out.println(x);
        }
        
    }
    public static void zadanie_11(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scan.nextInt();
        boolean result = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }

    }
    public static void zadanie_12() throws InterruptedException {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input amount of numbers");

        int n = scanner.nextInt();

        Random random = new Random();
        int [] numb = new int[n];

        for (int i = 0; i <numb.length; i++) {
            numb[i] = random.nextInt(9) + 1;
            System.out.print(numb[i] + "  ");
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i <numb.length; i++) {
            int x = numb[i]%3;
            if (x == 0){
                System.out.println("number%3 = 0 : "  + numb[i]);
                sum+=numb[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
