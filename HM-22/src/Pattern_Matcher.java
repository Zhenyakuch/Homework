import javax.crypto.spec.PSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */

public class Pattern_Matcher {
    public static void main(String[] args) {

        String str = "0x7FFF мама  0x7AAF мыла      раму";
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = p.matcher(str);
            while (m.find()) {
                System.out.println(m.start() + " " + m.end());
            }



    }
}



