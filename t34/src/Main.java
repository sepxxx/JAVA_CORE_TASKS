import java.util.ArrayList;
import java.util.List;

//Урок 34: Wildcards (Generics)
public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(1));

        List <Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

    }
    //<? extends Animal> и есть Generic Wildcard.
    //Позволяет делать операции как над списком типа Animal, так и типов наследников, вроде Dog
    public static void test(List <? extends Animal> animals) {
        for (Animal animal:animals) {
            System.out.println(animal);
        }
    }
}