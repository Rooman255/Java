import java.util.Scanner;

/**
 Написать программу, которая запросит пользователя ввести <Имя> в консоли. Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
public class sem1_1 {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner iScanner = new Scanner(System.in); //,"Cp866 - для восприятия русских букв");
        String name = iScanner.nextLine();
        System.out.printf("Hello %s", name);

    }
}