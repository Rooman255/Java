package DZ2;

import java.io.FileWriter;
import java.io.IOException;
/*К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
4 + 3 = 7
*/
import java.util.Scanner;
public class dz2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("imput number: ");
        int n = sc.nextInt();
        System.out.print("imput sign: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(n + sc.nextInt());
                break;
            case '-':
                System.out.println(n - sc.nextInt());
                break;
            case '*':
                System.out.println(n * sc.nextInt());
                break;
            case '/':
                System.out.println(n / sc.nextInt());
                break;
            default:
                System.out.println("Неизвестная знак");
                writelog(sc);
        sc.close();
        }
    }
    private static void writelog(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("log.txt");
            fw.write(sc.nextLine());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sc.nextLine());
    }
}
