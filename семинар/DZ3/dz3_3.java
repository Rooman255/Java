// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package DZ3;


import java.util.ArrayList;
import java.util.Random;

public class dz3_3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random ran = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(ran.nextInt(100));
                
            }
        System.out.println(numbers);
        
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            sum += numbers.get(i);
            average = sum / numbers.size();
        }
        System.out.println(min + " " + max + " " + average);
    }
}

