package translator;

import directory.Dictionary;

import static directory.Dictionary.UNITS;

public class BaseTranslator {

    public static String translator(Integer number){
        StringBuilder result = new StringBuilder();
        if(number == null || number < 0) return null;

        int last = number % 10;
        String str = number.toString();
        for (int i = 0; i < str.length()  ; i++) {

            if(last!=0){
                switch (last){
                    case UNITS :
                        if (last == '1') result.append("один");
                        else  if (last == '2') result.append("два");
                }
            }

        }

        return number.toString();

    }





    public static void main(String[] args) {
        System.out.println(new BaseTranslator().translator(123));
    }
}
