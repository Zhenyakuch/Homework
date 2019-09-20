/*

*/

import java.util.Scanner;

public class Cards_Bank {
    static int password;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client card = new Client();
        Administrator administrator = new Administrator();
        System.out.println("1. Admin" + "\n" +  "2. Client");
        int change = sc.nextInt();

        if (change == 1) {
            System.out.println(card);
            System.out.println("Input password:");

            password = sc.nextInt();
            if (password == 12345678) {
                //  while (sc.next().equals("q")) {
                System.out.println("Good! Your logging");
                System.out.println("Change option: ");
                System.out.println("1. Pay order ");
                System.out.println("2. Make a payment to another Account ");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Input sum: ");
                        int sum = sc.nextInt();
                        card.pay(sum);
                        break;
                    case 2:
                        System.out.println("Input sum: ");
                        int sum2 = sc.nextInt();
                        card.payment(sum2);
                        break;
                    case 3:
                        break;
                }
                // }

            } else {
                System.out.println("Error");
            }
            System.out.println(card);

    }else if (change == 2){
        administrator.block();
        administrator.card_null();
    }
    }
}
