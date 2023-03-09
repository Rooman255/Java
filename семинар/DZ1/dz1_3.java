// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;
public class dz1_3 {
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
        sc.close();
        }
    }
}
