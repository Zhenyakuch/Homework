/*
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
* */

public class StringAppend {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String one = "StringBuilder — класс, что представляет изменяемую последовательность\n" +
                "символов. Класс был введен в Java 5 и имеет полностью идентичный API с\n" +
                "StringBuffer. Единственное отличие — StringBuilder не синхронизирован. Это\n" +
                "означает, что его использование в многопоточных средах является нежелательным.\n" +
                "Следовательно, если вы работаете с многопоточностью, Вам идеально подходит\n" +
                "StringBuffer, иначе используйте StringBuilder, который работает намного быстрее в\n" +
                "большинстве реализаций.";

        String three = null;
        for (int i = 0; i <1000 ; i++) {
             three += one;

        }
        long stopTime1 = System.currentTimeMillis();
        long elapsedTime1 = stopTime1 - startTime1;
        System.out.println("Время сложения типа String = " + elapsedTime1);

        long startTime2 = System.currentTimeMillis();
        StringBuilder str1 = new StringBuilder(one);
        StringBuilder str3 =  new StringBuilder();
        for (int i = 0; i <1000 ; i++) {
             str3 = str3.append(str1);

        }
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println("Время сложения типа StringBuilder = " + elapsedTime2);

        long startTime3 = System.currentTimeMillis();
        StringBuffer str_one = new StringBuffer(one);
        StringBuffer str_three = new StringBuffer();
        for (int i = 0; i <1000 ; i++) {
             str_three = str_three.append(str_one);

        }
        long stopTime3 = System.currentTimeMillis();
        long elapsedTime3 = stopTime3 - startTime3;
        System.out.println("Время сложения типа StringBuffer = " + elapsedTime3);





    }

}
