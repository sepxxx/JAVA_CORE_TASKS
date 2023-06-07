//Урок 26: Интерфейсы
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob");
        Animal a1 = new Animal(111);
        output(a1);
        output(h1);
    }
    public static void output(Info info) {
        info.showInfo();
    }
}