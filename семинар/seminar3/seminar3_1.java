package seminar3;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Comparator;

// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

import java.util.Random;

public class seminar3_1 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random ran = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(ran.nextInt(100));
            }
        System.out.println(numbers);
        numbers.sort(null);
        // numbers.sort(Comparator.naturalOrder()); сортировка по возрастанию
        //  numbers.sort(Comparator.reverseOrder()); сортировка по убыванию
        System.out.println(numbers);       
    }

}