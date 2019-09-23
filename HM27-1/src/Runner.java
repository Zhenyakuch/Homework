/*
        Создать иерархию классов, описывающих банковские карточки.
        Иерархия должна иметь хотя бы три уровня.
*/

import java.util.Scanner;

public  class Runner extends Mastercard implements Cards  {
    int money2;
    public static void main(String[] args) {
        Visa visa = new Visa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую карту вы хотит получить? " + "\n" + "1.Visa" + "\n" + "2.MasterCard" );
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Вы получили карту Visa");
                System.out.println("В данный момент на вашем счету: " + money);
                System.out.println("Вы хотите пополнить счет (1) или получить кредит (2) ?");
                int k = sc.nextInt();
                if(k == 1){
                    visa.debit();
                }else if (k == 2){
                    visa.credit();
                }else {
                    System.out.println("Выберите 1 или 2");
                }
                break;
            case 2:
                System.out.println("Вы получили карту MasterCard");
                System.out.println("В данный момент на вашем счету: " + money);
                System.out.println("Вы хотите пополнить счет (1) или получить кредит (2) ?");
                int k1 = sc.nextInt();
                if(k1 == 1){
                    Mastercard.debit();
                }else if (k1 == 2){
                    Mastercard.credit();
                }else {
                    System.out.println("Выберите 1 или 2");
                }
                break;
        }
    }
}
