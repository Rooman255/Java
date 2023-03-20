// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;


public class dz4_1 {
    static LinkedList<Integer> reversList(LinkedList<Integer> listLinked) {
        LinkedList<Integer> listResult = new LinkedList<>();
        for (int element : listLinked) {
            listResult.addFirst(element);            
        }
        return listResult;
    }

    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>(Arrays.asList(66, 13, 3, 17, 25, 52));
        System.out.println(listNumbers.toString());
        System.out.println(reversList(listNumbers).toString());
    }
}
