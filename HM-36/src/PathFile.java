/*
        Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
        должны быть распечатаны отдельно.

 */

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class PathFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\");
        File file2 = new File("C:\\");
        for (File s : file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        }))
            // System.out.println(s.isFile());
            //  System.out.println(s.list());
            System.out.println(s.getName());
//            System.out.println(s.);


            for (File s2 : file2.listFiles()) {


                // System.out.println(s.isFile());
                //  System.out.println(s.list());
                System.out.println(s2.getName());
//            System.out.println(s.);




        }
    }
}

