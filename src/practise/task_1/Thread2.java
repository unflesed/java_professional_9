package practise.task_1;

public class Thread2 implements Runnable{
    int[] arr;
    int min = 1000;
    public Thread2(int[] arr) {
        this.arr = arr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
    }
}
