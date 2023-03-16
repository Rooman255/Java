package seminar3;

import java.util.ArrayList;
import java.util.Arrays;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

public class seminar3_2 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>(
                Arrays.asList("Mercury", "Venus", "Earth", "Venus", "Mars", "Jupiter", "Earth",
                        "Saturn", "Venus", "Uranus", "Earth", "Neptune", "Pluto"));
        int count = 0;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < ar.size(); i++) {
            count = 0;
            if (!result.contains(ar.get(i))) {
                result.add(ar.get(i));
                for (int j = 0; j < ar.size(); j++) {
                    if (ar.get(i).equals(ar.get(j))) {
                        count+=1;
                    }
                }
                System.out.println(ar.get(i) + " " + count);
            }
        }
    }
}