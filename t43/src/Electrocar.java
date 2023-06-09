public class Electrocar {
    private int id;
    Electrocar(int id) {
        this.id = id;
    }


    private class Motor {
        public void startMotor() {
            System.out.println("motor of car "+id+" is starting");
        }
    }

    public static class Battery {
        public void chargeBattery() {
            System.out.println("Battery is charging...");
        }

    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("ECar "+id+" is starting");
    }
}
