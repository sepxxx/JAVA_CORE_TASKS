public class Human implements Info{
    private String name;
    Human(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("name is "+name);
    }
}
