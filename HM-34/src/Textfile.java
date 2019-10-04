/*
        Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
        распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
        распечатать.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class Textfile {
        public static void main(String[] args) throws IOException {
int count = 0;
            try(BufferedReader text = new BufferedReader(new FileReader("File.txt"))){
                List<String> lines = Files.readAllLines(Paths.get("File.txt"));
                String str = String.valueOf(lines);
                System.out.println(str);

//                StringTokenizer stringTokenizer = new StringTokenizer(str, "[^0-9]");
//                while (stringTokenizer.hasMoreTokens()){
//                    stringTokenizer.nextToken();
//                    count++;
//                }
                String c = str.replaceAll("[^0-9]", "");

                System.out.println(c);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }
}
