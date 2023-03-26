package DZ6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class mainNoutbook {
    public static void main(String[] args) {

        Noutbook noutbook1 = new Noutbook(8, 256, "Windows", "silver");
        Noutbook noutbook2 = new Noutbook(16, 512, "Linux", "white");
        Noutbook noutbook3 = new Noutbook(8, 256, "MacOs", "black");
        Noutbook noutbook4 = new Noutbook(8, 1024, "Linux", "white");
        Noutbook noutbook5 = new Noutbook(8, 256, "Windows", "silver");
        Noutbook noutbook6 = new Noutbook(8, 512, "MacOs", "black");

        ArrayList<Noutbook> noutbooks = new ArrayList<>(
                Arrays.asList(noutbook1, noutbook2, noutbook3, noutbook4, noutbook5, noutbook6));
        System.out.println(
                "Для подбора параметров ноутбука введите последовательно критерии вашего выбора!");
        Map<String, Integer> mapOptions = new HashMap<>();
        mapOptions.put("Ram", 0);
        mapOptions.put("StorageCap", 0);
        mapOptions.put("Os", 0);
        mapOptions.put("colour", 0);
            Noutbook.printInvitationForUser(mapOptions);
        Scanner scn = new Scanner(System.in);

        int numberOption = -1;
        Set<Integer> setNumbersOptions = new HashSet<>();

        while (numberOption != 0) {
            if (setNumbersOptions.size() == 0) {
                numberOption = scn.nextInt();
                if (!Noutbook.checkNumberOption(numberOption, setNumbersOptions)) {
                    break;
                }
                setNumbersOptions.add(numberOption);
            }

            if (numberOption == 1) {
                System.out.println("Введите минимальный объем ОЗУ! ");
                int minRam = scn.nextInt();
                mapOptions.put("Ram", minRam);
                Noutbook.printInvitationForUser(mapOptions);
                numberOption = scn.nextInt();

                if (!Noutbook.checkNumberOption(numberOption, setNumbersOptions)) {
                    break;
                }
                setNumbersOptions.add(numberOption);
            }

            if (numberOption == 2) {
                System.out.println("Введите минимальный объем ЖД! ");
                int minStorageCap = scn.nextInt();
                mapOptions.put("StorageCap", minStorageCap);
                Noutbook.printInvitationForUser(mapOptions);
                numberOption = scn.nextInt();

                if (!Noutbook.checkNumberOption(numberOption, setNumbersOptions)) {
                    break;
                }
                setNumbersOptions.add(numberOption);
            }

            if (numberOption == 3) {
                System.out.println(
                        "Для выбора \"Windows\" введите 1,\n для выбора \"Linux\" введите 2,\n для выбора \"MacOs\" введите 3:\n");
                int numberOs = scn.nextInt();
                if (numberOs != 1 && numberOs != 2 && numberOs != 3) {
                    System.out.println("Ввели некорректный номер системы!!!");
                } else {
                    mapOptions.put("os", numberOs);
                    Noutbook.printInvitationForUser(mapOptions);
                    numberOption = scn.nextInt();

                    if (!Noutbook.checkNumberOption(numberOption, setNumbersOptions)) {
                        break;
                    }
                    setNumbersOptions.add(numberOption);
                }
            }

            if (numberOption == 4) {
                System.out.println(
                        "Для выбора цвета \"серебристый\" введите 1,\n для выбора \"белый\" введите 2:\n, для выбора \"черный\" введите 3:\n");
                int numberColour = scn.nextInt();
                if (numberColour < 1 && numberColour > 3) {
                    System.out.println("Ввели некорректный номер цвета!!!");
                } else {
                    mapOptions.put("colour", numberColour);
                    if (setNumbersOptions.size() == 4) {
                        break;
                    }
                    Noutbook.printInvitationForUser(mapOptions);
                    numberOption = scn.nextInt();
                    if (!Noutbook.checkNumberOption(numberOption, setNumbersOptions)) {
                        break;
                    }
                }
            }
        }

        ArrayList<Noutbook> setResult = Noutbook.getnoutbookSetByOptions(noutbooks, mapOptions);
        if (setResult.size() == 0) {
            System.out.println("К сожалению, по выбранным вами критериям ноутбуков нет!");
        } else {
            System.out.println("По выбранным вами критериям мы можем предложить следующий список ноутбуков:");
            System.out.println(setResult);
        }
        scn.close();
    }
}