package java_professional_9.task_3.way_1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new A());
        Thread thread2 = new Thread(new B());
        thread1.start();
        thread2.start();
    }
}
