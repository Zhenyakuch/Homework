/*
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 */


import java.util.Random;
import java.util.Scanner;

public class MaxRandom {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("input length: ");
        int len = scanner.nextInt();
        int [] rand = new int[len];

        for (int i = 0; i <rand.length; i++) {
            rand[i] = random.nextInt(99) + 1;
            System.out.print(rand[i] + " ");
        }
int max = 0;

                for(int i = 0; i < rand.length; i++){
                    if(max < rand[i]){
                        max = rand[i];
                        System.out.println();
                    }


            }
        System.out.println(max);

       // }
    }
}
