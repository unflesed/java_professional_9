package practise.task_1;

public class Thread1 implements Runnable {
    int[] arr;
    int max = 0;
    public Thread1(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
    }
}
