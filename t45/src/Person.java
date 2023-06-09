import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;

    private transient String info;
    Person(int age, String name, String info) {
        this.age = age;
        this.name = name;
        this.info = info;
    }
    public String toString() {
        return "AGE "+age+" NAME: "+name + " POSITION: "+info;
    }
}