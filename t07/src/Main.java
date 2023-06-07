import java.util.Scanner;

//Урок 7: Ввод данных. Класс Scanner.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
    }
}