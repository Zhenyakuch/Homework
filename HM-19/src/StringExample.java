/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
* */

public class StringExample {
    public static void main(String[] args) {

        String str = new String("  \"Странно!\"- громко   воскликнул я.     Вокруг   меня были перевёрнуты   парты,   стулья и школьная доска.  ");
        String trimmed = str.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;

        System.out.println("количество слов в тексте = " + words);
    }

}
