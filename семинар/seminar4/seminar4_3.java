package seminar4;

import java.util.Deque;
import java.util.LinkedList;

// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.


import java.util.Scanner;

public class seminar4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new LinkedList<String>();
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        while (!str.contains("print")) {
            queue.add(str);
            System.out.println(queue.toString());
            System.out.println("Enter new text:");
            str = scanner.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.pollLast());
        }
        System.out.println(queue.toString());
        scanner.close();
    }
}