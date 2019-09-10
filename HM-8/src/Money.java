import java.util.Random;
/*
Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
*/
public class Money {
    public static void main(String[] args) {
        Random random = new Random(1000);
      //  int x = random.nextInt();

        int x  = 12412;
        System.out.print(x);

        int last = x%10;
        int lastlast = x%100;

        if (lastlast == 11 | lastlast == 12 | lastlast == 13 | lastlast == 14 | lastlast == 15 | lastlast == 16 | lastlast == 17 |
                lastlast == 18 | lastlast == 19){
            System.out.println(" рублей");
        }
        else if (last == 1 | last ==-1){
                System.out.println(" рубль");
               }
        else if (last == 2 | last == -2 | last == 3 | last == -3 | last == 4 | last == -4)
                 {
            System.out.println(" рубля");
       }else if (last == 0 | last == 5 | last == -5 | last == 6 | last == -6 | last == 7 | last == -7 | last == 8 | last == -8 |
                 last == 9 | last == -9 )
         {
            System.out.println(" рублей");
       }


    }
}
