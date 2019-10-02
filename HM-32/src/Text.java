import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Text {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input string: ");
        String text = scanner.nextLine();

        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.:;!?\t");// указываем текст и разделители лексем

        while(tokenizer.hasMoreTokens()) { // hasMoreTokens() возвращает логическое значение true до тех пор, пока для извлечения еще имеются лексемы

             String token = tokenizer.nextToken();//nextToken(), чтобы извлечь последовательные лексемы
             Integer value = hashMap.get(token);

            if(value != null)
                hashMap.put(token, value + 1);
            else
                hashMap.put(token, 1);
        }

        System.out.printf("\ncount: %d\n", hashMap.size());
        
        for(Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
    }

}