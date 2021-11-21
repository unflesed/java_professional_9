package java_professional_9.task_3.way_1;

public class A implements Runnable{
    @Override
    public void run() {
        synchronized (A.class) {
            System.out.println("Запуск потока 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (B.class) {
                System.out.println("Остановка потока 1");
            }
        }

    }
}
class B implements Runnable{
    @Override
    public void run() {
        synchronized (A.class) {
            System.out.println("Запуск потока 2");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (B.class) {
                System.out.println("Остановка потока 2");
            }
        }
    }
}