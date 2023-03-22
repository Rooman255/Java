package seminar5;

import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class seminar5_1 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<Integer, String>();
        data.put(123456, "Иванов");
        data.put(321456, "Васильев");
        data.put(234561, "Петрова");
        data.put(234432, "Иванов");
        data.put(654321, "Петрова");
        data.put(345678, "Иванов");
        for (var element: data.entrySet()) {
            System.out.printf("key: %s, value: %s \n", element.getKey(), element.getValue());
        }
        for (var element: data.entrySet()) {
            if(element.getValue().equals("Иванов")){
                System.out.println(element.getKey());
            }
        }    
    }
}
