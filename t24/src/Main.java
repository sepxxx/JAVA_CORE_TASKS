//Урок 24: Класс Object и метод toString()
public class Main {
    public static void main(String[] args) {
        System.out.println(new Human("Ben", 10));
    }
}

class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}