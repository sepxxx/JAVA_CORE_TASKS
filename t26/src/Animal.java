public class Animal implements Info{
    private int id;
    Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("id is "+id);
    }
}
