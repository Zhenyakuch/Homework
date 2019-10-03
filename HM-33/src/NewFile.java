/*
    Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
    препинания и слов.*/

import java.io.*;
import java.util.StringTokenizer;

public class NewFile {
    public static void main(String[] args) throws IOException {
        try (FileWriter w_file = new FileWriter("File2.txt", false)) {
            String text = "В конструкторе использовался параметр append со значением false - то есть файл будет перезаписываться. Затем с помощью методов, определенных в базовом классе Writer производится запись данных.";
            w_file.append(text);

            int count = 0;
            int var = 0;
            StringTokenizer tokenizer = new StringTokenizer(text, "[!.,;:?\\-]");
            StringTokenizer tokenizer2 = new StringTokenizer(text);
            while (tokenizer.hasMoreElements()) { // hasMoreTokens() возвращает логическое значение true до тех пор, пока для извлечения еще имеются лексемы
                tokenizer.nextToken();
                count++;
            }

            while (tokenizer2.hasMoreElements()) { // hasMoreTokens() возвращает логическое значение true до тех пор, пока для извлечения еще имеются лексемы
                tokenizer2.nextToken();
                var++;
            }
            System.out.println();
            System.out.println("количество знаков: " + count);

            System.out.println();
            System.out.println("количество слов: " + var);

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

            try (FileReader read_f = new FileReader("File2.txt");) {
            int str = read_f.read();
            while (str != -1) {
                System.out.print((char) str);
                str = read_f.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}