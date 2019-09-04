import java.util.Scanner;

/*
 * создайте число. определите является ли оно трехзначным. определите, является ли его последняя цифра семеркой.
 * определите является ли оно четным
 */
public class NumberCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.print("Input number: ");
                int number = scan.nextInt();

                int length = String.valueOf(number).length();
                System.out.println("Length number: " + length);

                if (length ==3){
                    System.out.println("the number is a three digit");
                } else {
                    System.out.println("the number is not a three digit");
                    System.out.println("length number = " + length);
                }


                int lastnumber = number%10;
                if(lastnumber == 7){
                    System.out.println("The last number = 7");
                 }else {
                    System.out.println("The last number not = 7");
                    System.out.println("The last number = " + lastnumber);
                }

        int even = number%2;
        if(even == 0){
            System.out.println(number + " - even number");
        }else {
            System.out.println(number + " - not even number");
        }
    }
}
