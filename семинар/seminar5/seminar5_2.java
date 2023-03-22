package seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в 
//первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false

// Пример 2:

// Input: s = "paper", t = "title"

// Output: true
public class seminar5_2 {
    static boolean isIsomorf(String strFirst, String strSecond) {
        if(strFirst.length() != strFirst.length()){
            return  false;
        }
        Map<Character, Character> data = new HashMap<>();
        for (int i = 0; i < strFirst.length(); i ++) {
            if(! data.containsKey(strFirst.charAt(i))){
                data.put(strFirst.charAt(i), strSecond.charAt(i));
            }
            else {
            if(data.get(strFirst.charAt(i)) != strSecond.charAt(i))
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String strFirst = scn.nextLine();
        System.out.println("Enter second word: ");
        String strSecond = scn.nextLine();
        if (isIsomorf(strFirst, strSecond)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        scn.close();
    }
}
