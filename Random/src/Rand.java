import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        double i = Math.random() * (2);
        System.out.println(i);
        double i2 = Math.random() * ( 2);
        while (i != i2){
            i2 = Math.random() * (2);
            System.out.println(i);
            System.out.println(i2);
        }


        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }


}
