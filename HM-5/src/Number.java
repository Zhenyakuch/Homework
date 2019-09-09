//дано 4-х значное число. верно ли, что все цифры числа различны?


import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number: ");
        int number = input.nextInt();

      //  for (int i = 0; i<4; i++){
            int number1 = number%10;
            int number2 = number/10%10;
            int number3 = number/100%10;
            int number4 = number/1000%10;
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
            System.out.println(number4);

            if (number1 != number2 && number1 != number3 && number1 != number4 && number2 != number3 && number2 != number4 && number3 != number4){
                System.out.println("  верно  " );
            }else {
                System.out.println(" НЕ ВЕРНО  " );
            }
        }
    }



