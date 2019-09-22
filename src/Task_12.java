/*Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.  */
import java.util.Scanner; // импорт сканера

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст с пробелами:");
        String Stroka = in.nextLine();
        // удаляем пробелы
        String BezProbelov = Stroka.replaceAll("\\s+","");
        // выводим результат
        System.out.println("Введенный текст без пробелов: \n" + BezProbelov);
    }
}