public class Electrocar {
    private int id;
    Electrocar(int id) {
        this.id = id;
    }
    public void start() {
        System.out.println("ECar "+id+" is starting");
    }

    private class Motor {
        public void startMotor() {
            System.out.println("motor of car "+id+" is starting");
        }
    }
}
