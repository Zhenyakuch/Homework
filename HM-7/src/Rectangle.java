import java.util.Scanner;

/**
 * имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть
 * круглой картонкой радиусом r.
 */
public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a:  ");
        double a = scan.nextDouble();

        System.out.print("Input b: ");
        double b = scan.nextDouble();

        double square_rect = a * b;
        System.out.println("Square rectangle = "  + square_rect);

        System.out.print("Input radius: ");
        double radius = scan.nextDouble();
        double pi = Math.PI;
        double square_circle = pi*Math.pow(radius,2);
        System.out.println("Square circle = " + square_circle);

        if (square_circle > square_rect){
            System.out.println("can close");
        }else {
            System.out.println("can't close");
        }

        scan.close();
    }
}
