/*Напишите метод, который составит строку, состоящую
из 100 повторений слова TEST и метод, который запишет
эту строку в простой текстовый файл, обработайте
исключения.
*/

package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class seminar2_4 {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 10; i++){
            sb.append("Test");
            }
        try{
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        }
        catch(IOException e) {
            System.out.println("ERROR ");
        }
    }
}
