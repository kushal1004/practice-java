class Process1 implements Runnable {

    // as it is child class of Runnable so we have to @Override the Run method
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Index of Process1 is: " + i);
        }
    }

}

class Process2 implements Runnable {

    // as it is child class of Runnable so we have to @Override the Run method
    public void run() {
        for (int i = 50; i < 75; i++) {
            System.out.println("Index of Process2 is: " + i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();

        // at the time of object creation contructor of thread will also run which will
        // take Runnable type Object but it is not posssible as Runnable is a interface.
        // But interface can create reference variable. we have to give input of child's
        // Object(which inherrit the Runnable interface).

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        // To start Thread ,it's have start method
        t1.start();
        t2.start();
    }
}
