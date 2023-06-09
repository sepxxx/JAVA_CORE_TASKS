import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.bin"))){
//            Person p1 = (Person) ois.readObject();
//            Person p2 = (Person) ois.readObject();
//            System.out.println(p1);
//            System.out.println(p2);
            Person[] people = (Person[]) ois.readObject();
            for (Person person:people) {
                System.out.println(person);
            }
//            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
