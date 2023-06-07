//Урок 32: Восходящее и нисходящее преобразование.
public class Main {
    public static void main(String[] args) {
//        //Upcasting
//        Dog dog = new Dog();
//        Animal a = dog;
//        a.eat();
//        //Downcasting безопасно в этом случае
//        Dog dog2 = (Dog) a;
//        dog2.bark();

        //Downcasting НЕ безопасно в этом случае
        Animal a = new Animal();
        Dog dog  = (Dog) a;
        dog.bark();
    }
}