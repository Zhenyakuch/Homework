import java.util.Scanner;

/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */
public class Atm {
    private static int bill_20; //количеством купюр номиналом
    private static int bill_50;
    private static int bill_100;
    private static int moneys;// количество денег в банкомате
    private static int nal;//снятые наличные
    private static boolean result;
    private static int operation;
    private static int[] nominal;

    private Atm(int bill_20, int bill_50, int bill_100) {

        this.bill_20 = bill_20;
        this.bill_50 = bill_50;
        this.bill_100 = bill_100;
        moneys = bill_20 * 20 + bill_50 * 50 + bill_100 * 100;

        nominal = new int[]{20, 50, 100};
    }

    public static boolean minus_money(int nal) {
        moneys -= nal;
        if (moneys < 0) {
            System.out.println("Ошибка: в банкомате нет такой суммы");
            result = false;
        } else {
            int[] count = new int[nominal.length]; //кол-во купюр выдать
            int index = nominal.length - 1;
            while (index != -1) {
                count[index] = nal / nominal[index];
                nal %= nominal[index];
                index--;
            }
            if(nal==0){
                for (int i = 0; i < count.length; i++) {
                    System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i], count[i]);
                }
                System.out.println("Операция завершена успешно");
            }else{
                System.out.println("Сумма введена неверно. Имеющиеся номиналы: 20, 50, 100");
            }
            result = true;
        }
        return result;
    }


    private static void plus_money(){
        moneys+=nal;
    }

    public static void main(String[] args) {
        Atm atm1 = new Atm(19,30,100);
        Scanner sc = new Scanner(System.in);
        System.out.println("В банкомате: " + moneys);
        System.out.println("Выберите опреацию, которую хотите выполнить:");
        System.out.println("1. Пополнить счет");
        System.out.println("2. Снять наличные");
        operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Сколько хотите добавить? ");
                nal = sc.nextInt();
                plus_money();
                System.out.println("В банкомате осталось:" + moneys);
                break;
            case 2:
                System.out.println("Введите сумму которую хотит снять");
                nal = sc.nextInt();
                minus_money(nal);
                break;
        }
    }
}
