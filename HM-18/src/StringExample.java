/*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.
* */

public class StringExample {
    public static void main(String[] args) {

        String str = new String("\"Странно!\"- громко воскликнул я. Вокруг меня было перевёрнуто всё : парты, стулья и школьная доска." +
                                        " Неужели первоклассникам хватило перемены для этой революции?" +
                                        " Я - уважаемый учитель; вокруг наконец-то воцарилась тишина...");
        char symbol;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if(symbol == '"' || symbol == '-' || symbol == '.' || symbol == ':' || symbol == ',' || symbol == '?' || symbol == '?' ){
                    count++;
            }

        }
        System.out.println("количество знаков препинания  = " + count);

    }
}
