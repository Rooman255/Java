// (Дополнительно) Реализовать алгоритм сортировки слиянием

package DZ3;

import java.io.IOException;
import java.util.*;

public class dz3_1 {

    public static int[] mergeSort(Integer[] integers) {
        Integer[] buffer1 = Arrays.copyOf(integers, integers.length);
        int[] buffer2 = new int[integers.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, integers.length);
        return result;
    }

    private static int[] mergeSortInner(Integer[] buffer1, int[] buffer2, int startIndex, int length) {
        return null;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) throws IOException{
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random ran = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(ran.nextInt(100));
            }
        System.out.println(numbers);
        int[] result = mergeSort(numbers.toArray(new Integer[numbers.size()]));
        System.out.println(Arrays.toString(result));
    }
}