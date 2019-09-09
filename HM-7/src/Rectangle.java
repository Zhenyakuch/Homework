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
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("Input r: ");
        double r  = scan.nextDouble();
        double d = 2*r;

        if (d >=c){
            System.out.println("can");
        }else{
            System.out.println("can't");
        }




        scan.close();
    }
}
