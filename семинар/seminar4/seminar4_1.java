package seminar4;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class seminar4_1 {
    public static void main(String[] args) {
        long timeStart1 = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long timeFinish1 = System.currentTimeMillis();
        System.out.printf("The time1 = %d \n", timeFinish1 - timeStart1);
        long timeStart2 = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long timeFinish2 = System.currentTimeMillis();
        System.out.printf("The time2 = %d", timeFinish2 - timeStart2);
    }
}