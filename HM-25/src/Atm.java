/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */
public class Atm {
    private static int bill_20 ;
    private static  int bill_50 ;
    private static  int bill_100;

    private Atm(int bill_20, int bill_50, int bill_100){

        this.bill_20 = bill_20;
        this.bill_50 = bill_50;
        this.bill_100 = bill_100;

    }

    public void minus_money(){

    }

    public void plus_money(){

    }









    public static void main(String[] args) {
        Atm atm1 = new Atm();
        Atm atm2 = new Atm();
        Atm atm3 = new Atm();


    }
}
