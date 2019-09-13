/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

public class Time {
    private int second;
    private long minute;
    private  int hour;

    public Time(int second, int hour){
        this.second = second;
        this.hour = hour;

    }
    public Time( int second, long minute){
        this.second = second;
        this.minute = minute;

    }
     public int seconds(){
        second = second + hour*60*60;
        second = second + (int)minute*60;
         System.out.println("Общее количество секунд объекта  " + second);
         return second;
     }

    public void compareto(Time time2){
        Time time1 = new Time(this.second, this.hour);
        int sec1 = time1.seconds();
        int sec2 = time2.seconds();

        if(sec1>sec2){
            System.out.printf("sec1 > sec2  ");
            System.out.println(sec1 > sec2);

        }else{
            System.out.printf("sec1 < sec2  ");
            System.out.println(sec1 < sec2);
        }

    }




    public static void main(String[] args) { //add comment
         Time time1 = new Time(49, 4);
         Time time2 = new Time(55, 240L);
         time1.compareto(time2);


    }
}
