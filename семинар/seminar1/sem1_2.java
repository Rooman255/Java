/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.*/

public class sem1_2 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int n = 0;
        int max = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 1) 
            {
                n++;
            } 
            else if (max < n) 
            {
                max = n;
                n = 0;
            }
        }
        if (max < n) 
            {
                max = n;
                n = 0;
            }
        System.out.println(max);
    }
}