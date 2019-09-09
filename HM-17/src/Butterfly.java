/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой»
*/

public class Butterfly {
    public static void main(String[] args) {

        int but[][]=new int[5][5];
        int i,j;


        for (i=0;i<but.length/2;i++){
            for (j=0;j<but[i].length;j++){
                if ((j<i) || (j>=(but[i].length-i))) {
                    but[i][j] = 0;
                }
                else {
                    but[i][j] = 1;
                }

            }

        }
        for (i=but.length-1; i>=but.length/2; i--) {
            for (j = 0; j < but[i].length; j++) {
                if ((j < (but[i].length - 1 - i)) || (j > i)) {
                    but[i][j] = 0;
                } else {
                    but[i][j] = 1;
                }
            }
        }
        for (i=0;i<but.length;i++){
            for(j=0;j<but[i].length;j++){
                System.out.print(but[i][j]);
            }
            System.out.println(" ");
        }
    }
    }

