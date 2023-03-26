package seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class seminar6_2 {
    // public static void main(String[] args) {
    //     int[] array = new int[100];
    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = (int) (Math.random() * 100);
    //     }
    //     System.out.printf("%.2f %%", getProcent(array));
    // }

    // public static int getProcent(int[] array) {
    //     int count = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] % 2 == 0) {
    //             count++;
    //         }
    //     }
    //     return count * 100 / array.length;
    // }
        public static void main(String[] args) {
            ArrayList<Integer> listTest = new ArrayList<Integer>();
            for (int i = 0; i < 130; i++) {
                listTest.add((int) (Math.random() * 100));
            }
            System.out.printf("%.2f %%", getProcent(listTest));
        }
        static double getProcent(ArrayList<Integer> listTest){
            Set<Integer> setgetProcent = new HashSet<>(listTest);
            return (double) setgetProcent.size() / listTest.size() * 100;
        }
    }
        


