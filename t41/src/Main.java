//Урок 41: Абстрактные классы.
//Различие - интерфейс - то что класс умеет делать
//Абcтрактный класс - то чем класс является
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.eat();
        dog.eat();
        cat.makeSound();
        dog.makeSound();
    }
}