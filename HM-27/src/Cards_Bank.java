/*

*/

import java.util.Scanner;

public class Cards_Bank {
    static int password;

    public static void main(String[] args) {
        Client card = new Client();
        Admiistrator admiistrator = new Admiistrator();
        System.out.println(card);
        System.out.println("Input password:");
        Scanner sc = new Scanner(System.in);
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
        }

}