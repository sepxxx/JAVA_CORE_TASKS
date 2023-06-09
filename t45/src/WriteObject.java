import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person p1 = new Person(10, "Jan");
//        Person p2 = new Person(20, "Xan");
        Person [] people = {new Person(10, "Jan", "SD"), new Person(20, "Xan", "QAI"), new Person(30, "Zan", "SD")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.bin"))){
//            oos.writeObject(p1);
//            oos.writeObject(p2);
            oos.writeObject(people);
//            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
