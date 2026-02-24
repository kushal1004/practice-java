class Car {
    public Car() {
        System.out.println("This is default constructor of car");
    }

    public Car(int a) {
        super();
        System.out.println("For " + a + " this is parameterized constructor");
    }

    public void show() {
        System.out.println("This is from show method of Car class");
    }
}

class BMW extends Car {
    public BMW() {
        super(5);
        System.out.println("This is default BMW");
    }

    public BMW(int a) {
        this();
        System.out.println("Parametarized contructor for " + a);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car = new Car(3);
        // Car car = new BMW();
        // BMW car = new BMW(3);
        new Car().show(); // anonymous object
    }
}
