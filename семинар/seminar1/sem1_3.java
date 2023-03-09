import java.util.Arrays;

// Дан массив nums = [3,2,2,3,4,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// Вывод:
// [2,2,4,5,3,3,3]

public class sem1_3 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 2, 3, 4, 5, 3 };
        int val = 3;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == val) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

// public class sem1_3 {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 1, 2, 3, 4, 5, 4, 3, 4 };
//         // [1,2,4,5,4,4, 3,4 ]
//         int count = 0;

//         for (int i = 0; i < arr.length; i++)
//             if (arr[i] != 3) {
//                 arr[count++] = arr[i];
//             }
//         System.out.println(Arrays.toString(arr));
//         while (count < arr.length)
//             arr[count++] = 3;
//         System.out.println(Arrays.toString(arr));
//     }
// }
