import java.util.Random;
/*
Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
*/
public class Money {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.print(x);

        int last = x%10;
        switch (last){
            case 1:
            case -1:
                System.out.println(" рубль");
                break;
            case 2:
            case 3:
            case 4:
            case -2:
            case -3:
            case -4:
                System.out.println(" рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
            case -5:
            case -6:
            case -7:
            case -8:
            case -9:
                System.out.println(" рублей");
                break;

        }


    }
}
