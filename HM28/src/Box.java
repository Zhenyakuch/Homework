/*
        Написать класс, который умеет хранить в себе массив любых типов данных (int, long
        etc.). Реализовать метод get(int index), который возвращает любой элемент
        массива по индексу.
*/

import java.util.ArrayList;
import java.util.Map;

public class Box  {

    public static <E> void  sid  (String s, E [] arr){


        E [] a = arr;
        AnyTapeArray <E> sid = new AnyTapeArray <E> ();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();
    }



    public static void main(String [] args){

        String [] s = {"Hello", "World","!"};
        sid("String" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);

        Double [] ad = {1.2,1.5,6.7};
        sid("Double" , ad);

    }

}