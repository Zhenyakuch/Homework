import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int sec = 4500;
        int min_sec = sec % 60;
        int min  = (sec - min_sec) / 60;
        int hour_min = min % 60;
        int hour = (min - hour_min) / 60;
        int day = sec / 24 / 60 / 60;
        int week = day / 7;
        System.out.println(min + " минут " + min_sec + " секунд");
        System.out.println(hour + " час " + min + " минут " + min_sec + " секунд");
        System.out.println(day + " дней " + hour + " час " + min + " минут " + min_sec + " секунд");
        System.out.println(week + " недель " + day + " дней " + hour + " час " + min + " минут " + min_sec + " секунд");
        System.out.println(":)");

        Scanner num = new Scanner(System.in);
        System.out.println("input number: ");
        int number = num.nextInt();
        int y = 0;
        while (number!=0) {
            y = y * 10 + number % 10;
            number /= 10;
            System.out.println(y);
        }
    }
}
