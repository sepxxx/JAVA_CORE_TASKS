import java.util.ArrayList;
import java.util.List;

//Урок 33: Введение в параметризацию. (Generics)
public class Main {
    public static void main(String[] args) {
        //<String> показывает что хранятся строки а не Objects как было бы по умолчанию
        //Generics заменяют использование downcasting
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");

        for (String animal:animals) {
            System.out.println(animal);
        }
    }
}