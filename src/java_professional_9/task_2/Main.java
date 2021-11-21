package java_professional_9.task_2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new A());
        Thread thread2 = new Thread(new B());
        thread1.start();
        thread2.start();
    }
}
