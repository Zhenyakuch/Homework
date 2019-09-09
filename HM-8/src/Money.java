import java.util.Random;
/*
Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
*/
public class Money {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int x = random.nextInt();
        System.out.print(x);

        int last = x%10;

       if (last == 1 & last ==-1){
                System.out.println(" рубль");
               }else if (last == 2 & last == -2 & last == 3 & last == -3 & last == 4 & last == -4)
                 {
            System.out.println(" рубля");
       }else if (last == 0 && last == 5 && last == -5 && last == 6 && last == -6 && last == 7 && last == -7 && last == 8 && last == -8 &&
                 last == 9 && last == -9 && last == 11 && last == 12 && last == 13 && last == 14 && last == 15 && last == 16 && last == 17 &&
                 last == 18 && last == 19)
         {
            System.out.println(" рублей");
       }


    }
}
