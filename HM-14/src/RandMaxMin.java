import java.util.Random;

/*
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
*/
public class RandMaxMin {
    public static void main(String[] args) {
        Random random = new Random();
        int len = random.nextInt(5) + 10;

        int[] marks = new int[len];
        for (int i = 0; i <marks.length ; i++) {
            marks[i] = random.nextInt(6) + 4;
            System.out.print(" " + marks[i]);
        }
        System.out.println();
        int max = 0;
        int min =  10;
        int index_max = 0;
        int index_min = 0;


        int[] maxim = new int[10];
        for(int i = 0; i < marks.length; i++){
                if (max < marks[i]) {
                    max = marks[i];
                    index_max = i;
                }

            if(min > marks[i]){
                min = marks[i];
                index_min = i;
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (max == marks[i]){
                index_max = i;
                System.out.println("index_max " + index_max + "            max_number = " + max);

            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (min == marks[i]){
                index_min = i;
                System.out.println("index_min " + index_min + "            mun_number = " + min);

            }
        }

    }
}
