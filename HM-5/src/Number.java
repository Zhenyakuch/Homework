//дано 4-х значное число. верно ли, что все цифры числа различны?


import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number: ");
        int number = input.nextInt();

        for (int i = 0; i<4; i++){
            int number2 = number%10;
            number/=10;
            System.out.println(number2);
            int number3 = number%10;
            System.out.println(number3);
            if (number2 != number3){
                System.out.println(number2 +"  Не равно  " + number3);
            }else {
                System.out.println(number2 +"  Равно  " + number3);
            }
        }
    }

}

