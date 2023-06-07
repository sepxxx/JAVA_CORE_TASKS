//Урок 21: Ключевое слово static.
//1)используется для общих полей класса
//2)может быть использовано для создания коллекции методов - пример библиотека math
//вызываем методы не от обьекта а от класса
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Jackob", 10);
        System.out.println(Human.getCounter());
    }
}

class Human {
    private String name;
    private int age;
    private static int counter;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}