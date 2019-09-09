/*
10. Посчитать факториал числа  (не используя рекурсию).
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
        Scanner scan = new Scanner(System.in);
        System.out.println("input number");
        int number = scan.nextInt();

        int fact = 1;
        for (int i = 1; i < number ; i++) {
            fact*=i;

        } System.out.println(fact);
        
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

        int sum = 0;
        for (int i = 3; i <n; i+=3) {
            sum += i;

        }
        System.out.print("sum = " + sum);


    }
}
