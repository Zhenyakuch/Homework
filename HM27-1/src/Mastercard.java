import java.util.Scanner;

public class Mastercard implements Cards{
    private static Scanner sc = new Scanner(System.in);

    public static void debit() {
        System.out.println("На какую сумму пополняете?");
        int p = sc.nextInt();
        int money2 = money;
        money2 +=p;
        System.out.println("На вашем счету: " + money2 + p%17 + "\n"+"Бонусом вы полуаете: " + p%17);

    }

    public static void credit() {

        System.out.println("Какую сумму хотите снять? ");
        int p = sc.nextInt();
        int money2 = money;
        money2 = money2 - p - p%27;
        int procent =  money2 + money2%27;
        System.out.println("На вашем счету задолженоость: " + money2+ "\n"+"Проценты составляют: " + p%27);
        System.out.println("Вы ее должны погасить в течении 10 месяцев" + "\n" + "Ваш ежемесяный платеж составит" +  (money2 - money2%27)/6);
    }
}
