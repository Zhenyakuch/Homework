import javax.crypto.spec.PSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
 *которых есть параметры, например <p id=”p1”>, и замену их на простые теги
 *абзацев <p>.
 */

public class Pattern_Matcher {
    public static void main(String[] args) {

        String str = "<p> В одних садах цветёт миндаль, в других метёт метель.</p>\n" +
                "   <p id=”p1”> В одних краях ещё февраль, в других - уже апрель.</p>\n" +
                "   <p>Проходит время, вечный счёт: год за год, век за век...</p>\n" +
                "   <p id=”p1”> Во всём - его неспешный ход, его кромешный бег.</p>\n" +
                "   <p>В году на радость и печаль по двадцать пять недель.</p>\n" +
                "   <p id=”p1”> Мне двадцать пять недель февраль, и двадцать пять - апрель.</p>\n" +
                "   <p>По двадцать пять недель в туман уходит счёт векам.</p>\n" +
                "   <p id=”p1”> Летит мой звонкий балаган куда-то к облакам.</p>\n" +
                "   <p><i>М. Щербаков</i></p>";


        Pattern p = Pattern.compile("<p>");
        Matcher m = p.matcher(str);

        Pattern p2 = Pattern.compile("<p\\s..{1,10}>");
        Matcher m2 = p2.matcher(str);

            while (m.find() ) {
                System.out.println("  <p>: " + m.start() + " - " + m.end());

        }
        while (m2.find()) {
            System.out.println("  <p???>: " + m2.start() + " " + m2.end());

        }

        try{
            String resultString = m2.replaceAll("<p>");
            System.out.println(resultString);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}



