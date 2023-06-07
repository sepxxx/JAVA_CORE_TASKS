//Урок 12: Цикл for each, Массивы строк.
public class Main {
    public static void main(String[] args) {
        String strings[] = new String[3];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "java";

        for(String string:strings) {
            System.out.println(string);
        }
    }
}