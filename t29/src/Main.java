//Урок 29: Полиморфизм
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(cat);
        test(dog);
    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
//Польза полиморфизма в данном случае в том, что не пришлось
//организовывать 3 метода test для разных типов  Animal Dog Cat
//В test можно передать как cat так и dog