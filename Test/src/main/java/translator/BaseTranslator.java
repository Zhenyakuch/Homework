package translator;

import directory.Dictionary;

import java.util.Scanner;

public class BaseTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Integer number = scanner.nextInt();

        String str = number.toString();
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        String str2 = String.valueOf(stringBuffer.reverse());
        System.out.println(str2);

         int last = 0;
         int count = 0;


        for (int i = 0; i < str .length(); i ++) {

            last = number %10;
            number = number/10;
            count++;


            switch (count){
                case 1:
                    if(last == 1){System.out.printf(Dictionary.one);}
                    else if(last == 2){System.out.printf(Dictionary.two);}
                    else if(last == 3){System.out.printf(Dictionary.three);}
                    else if(last == 4){System.out.printf(Dictionary.four);}
                    else if(last == 5){System.out.printf(Dictionary.five);}
                    else if(last == 6){System.out.printf(Dictionary.six);}
                    else if(last == 7){System.out.printf(Dictionary.seven);}
                    else if(last == 8){System.out.printf(Dictionary.eight);}
                    else if(last == 9){System.out.printf(Dictionary.nine);}
                    break;
                case 2:
                    if(last == 2){System.out.printf(Dictionary.two);}
                    else if(last == 3){System.out.printf(Dictionary.three);}
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
            }


        }
         scanner.close();
    }


}
