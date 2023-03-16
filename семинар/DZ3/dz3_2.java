// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package DZ3;

import java.util.ArrayList;
import java.util.Random;

public class dz3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random ran = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(ran.nextInt(100));
                
            }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
