package java_professional_9.additional;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread("Демона"));
        Thread thread2 = new Thread(new MyThread("Пользовательский"));
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("ID потока демона " + thread1.getId());
        System.out.println("Имя потока демона " + thread1.getName());
        System.out.println("Приоритет потока демона " + thread1.getPriority());
        System.out.println("Состояние потока демона " + thread1.getState());
        System.out.println("Класс потока демона " + thread1.getClass());


    }
}
class MyThread implements Runnable{
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Остановка потока " + name);
    }
}