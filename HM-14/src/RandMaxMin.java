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

        for(int i = 0; i < marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
                 index_max = i;
               // System.out.println("index" + i);
            }

            if(min > marks[i]){
                min = marks[i];
                index_min = i;
               // System.out.println("index" + i);
            }
        }
        System.out.println("max - " + max +  "  index = " + index_max);
        System.out.println("min - " + min+  "  index = " + index_min);
    }
}
