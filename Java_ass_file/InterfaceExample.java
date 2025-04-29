// interface is a reserved keyword in Java
// the code for example of interface in Java{

// Interface definition
interface Vehicle {
    void start();  // abstract method
    void stop();   // abstract method
}

// Class Car implements Vehicle
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

// Class Bike implements Vehicle
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v;  // Interface reference

        v = new Car();
        v.start();
        v.stop();

        v = new Bike();
        v.start();
        v.stop();
    }
}
