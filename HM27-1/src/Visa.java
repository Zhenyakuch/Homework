import java.util.Scanner;

public class Visa implements Cards {
Scanner sc = new Scanner(System.in);
    public void debit() {
        System.out.println("На какую сумму пополняете?");
        int p = sc.nextInt();
        int money2 = money;
        money2 +=p;
        System.out.println("На вашем счету: " + money2);

    }

    public void credit() {

        System.out.println("Какую сумму хотите снять? ");
        int p = sc.nextInt();
        int money2 = money;
        money2 -=p;
        System.out.println("На вашем счету задолженоость: " + money2);
        System.out.println("Вы ее должны погасить в течении 6 месяцев" + "\n" + "Ваш ежемесяный платеж составит" + money2/6);

    }
}
