//Урок 35: Анонимные классы

interface AbleToEat{
    public void eat();
}

public class Main {
    public static void main(String[] args) {
        AbleToEat ate = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ate.eat();
    }
}