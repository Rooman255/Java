package DZ6;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class Noutbook {
    private Integer ram;
    private Integer storageCap;
    private String os;
    private String colour;

    public Noutbook(Integer ram, Integer storageCap, String os, String colour) {
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
    public void setStorageCap(Integer storageCap) {
        this.storageCap = storageCap;
    }
    public void setOS(String os) {
        this.os = os;
    }
    public void setcolour(String colour) {
        this.colour = colour;
    }
    public Integer getRam(){
        return ram;
    }
    public Integer getStorageCap(){
        return storageCap;
    }
    public String getOS(){
        return os;
    }
    public String getcolour(){
        return colour;
    }
    @Override
    public String toString() {
        return String.format("ram = %d, storageCap = %d, os = %s, colour = %s\n", ram,
        storageCap, os, colour);
    }

    public static int getIndexOs(String sysOper) {
        if (sysOper.equals("Windows")) {
            return 1;
        }
        if (sysOper.equals("Linux")) {
            return 2;
        }
        if (sysOper.equals("MacOs")) {
            return 3;
        }
        return 0;
    }

    public static int getIndexColour(String colour) {
        if (colour.equals("silver")) {
            return 1;
        }
        if (colour.equals("white")) {
            return 2;
        }
        if (colour.equals("black")) {
            return 3;
        }
        return 0;
    }

    public static boolean checkNumberOption(int numberOption, Set<Integer> setNumbersOptions) {
        if (numberOption == 0) {
            return false;
        }
        if (numberOption < 0 && numberOption > 4) {
            System.out.println("Ввели некорректный номер критерия выбора!");
            return false;
        }
        if (setNumbersOptions.contains(numberOption)) {
            System.out.println("Такой номер критерия уже выбран!");
            return false;
        }
        return true;
    }

    public static void printInvitationForUser(Map<String, Integer> mapOptions) {
        int indexRam = mapOptions.get("ram");
        int indexStorageCap = mapOptions.get("storageCap");
        int indexOs = mapOptions.get("os");
        int indexColour = mapOptions.get("colour");
        StringBuilder strb = new StringBuilder();
        if (indexRam == 0 || indexStorageCap == 0 && indexOs == 0 && indexColour == 0) {
            strb.append("Введите цифру, соответствующую необходимому критерию:\n");
        }
        if (indexRam == 0) {
            strb.append(" 1 - ОЗУ\n");
        }
        if (indexStorageCap == 0) {
            strb.append(" 2 - Объем ЖД\n");
        }
        if (indexOs == 0) {
            strb.append(" 3 - Операционная система\n");
        }
        if (indexColour == 0) {
            strb.append(" 4 - Цвет\n");
        }
        System.out.println(strb.append(" 0 - для завершения выбора\n").toString());
    }

    public static ArrayList<Noutbook> getnoutbookSetByOptions(ArrayList<Noutbook> setnoutbook,
            Map<String, Integer> mapOptions) {
        int indexOs = mapOptions.get("os");
        int indexColour = mapOptions.get("colour");
        int minRam = 0;
        if (mapOptions.containsKey("Ram")) {
            minRam = mapOptions.get("Ram");
        }
        int minStorageCap = 0;
        if (mapOptions.containsKey("StorageCap")) {
            minStorageCap = mapOptions.get("StorageCap");
        }
        ArrayList<Noutbook> setResult = new ArrayList<>();
        for (int i = 0; i < setnoutbook.size(); i++) {
            if (setnoutbook.get(i).ram >= minRam &&
                    setnoutbook.get(i).storageCap >= minStorageCap) {
                if (indexOs == 0 && indexColour == 0) {
                    setResult.add(setnoutbook.get(i));
                } else if (indexOs == 0
                        && getIndexColour(setnoutbook.get(i).colour) == mapOptions.get("colour")) {
                    setResult.add(setnoutbook.get(i));
                } else if (indexColour == 0
                        && getIndexOs(setnoutbook.get(i).os) == mapOptions
                                .get("os")) {
                    setResult.add(setnoutbook.get(i));
                } else if (getIndexOs(setnoutbook.get(i).os) == mapOptions
                        .get("os")
                        && getIndexColour(setnoutbook.get(i).colour) == mapOptions.get("colour")) {
                    setResult.add(setnoutbook.get(i));
                }
            }
        }
        return setResult;
    }
}