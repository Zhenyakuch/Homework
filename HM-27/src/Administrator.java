import java.util.Scanner;

public class Administrator {


    public static void block(){
        Scanner sc  = new Scanner(System.in);
        if (Client.account<0){
            System.out.println("Block yes or no?");
            String change = sc.next();
            switch (change){
                case "yes":
                    break;
                case "no":
                    break;
            }


        }


    }

    public static void card_null(){

    }


}
