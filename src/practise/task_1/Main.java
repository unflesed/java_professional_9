package practise.task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()*1000);
        }
        Thread1 th1 = new Thread1(array);
        Thread2 th2 = new Thread2(array);
        Thread thread1 = new Thread(th1);
        Thread thread2 = new Thread(th2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("MAX = " + th1.getMax());
        System.out.println("MIN = " + th2.getMin());

    }
}
