//Урок 42: Метод equals()
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(1);
        Animal a2 = new Animal(1);
        if(a1.equals(a2))
            System.out.println("EQUAL");

    }
}

class Animal {
    private int id;
    Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return otherAnimal.id == this.id;
    }
}