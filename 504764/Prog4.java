interface Vechile {
    abstract void start();
    default void stop() {
        System.out.println("Vechile Stopped");
    };
}

class Bike implements Vechile {
    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}

class Car implements Vechile {
    @Override
    public void start() {
        System.out.println("Car Started");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Prog4 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
        Car c = new Car();
        c.start();
        c.stop();
    }
}