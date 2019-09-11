/*
Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.
* */

public class StringExample {
    public static void main(String[] args) {

        String str = new String("Странно громко воскликнул я. Вокруг меня были перевёрнуты  парты, стулья и школьная доска.");
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' || str.charAt(i) == '.'|| str.charAt(i) == ','){
                symbol = str.charAt(i-1);
                if (symbol == '.' || symbol == ',') {
                    System.out.print("  " );
                }else{
                    System.out.print("  " + symbol);
                }

            }

        }
    }

}
