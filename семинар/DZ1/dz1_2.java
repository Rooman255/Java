// Вывести все простые числа от 1 до 1000
public class dz1_2 {
    public static void main(String[] args) 
    {
        StringBuilder st = new StringBuilder();
        st = st.append("1");
        for (int i = 2; i <= 1000; i++) 
        {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    isPrimeNumber = false;
                    break;
                }
            }

        if (isPrimeNumber) {
            st = st.append(", ").append(i);
            }
        }
        System.out.println(st);
    }  
}
