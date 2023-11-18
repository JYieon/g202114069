package g202114069;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Exam7 {

    static Queue<Integer> queue = new ArrayDeque<Integer>();

    static class Producer extends Thread {
        final int count = 10;
        Random random = new Random();

        @Override
        public void run() {
            try {
                for (int i = 0; i < count; ++i) {
                    Thread.sleep(10);
                    int n = random.nextInt(10)+1;
                    synchronized(queue) {
                        queue.add(n);
                        queue.notify();
                    }
                }
                synchronized(queue) {
                    queue.add(-1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; ++i) {
            Thread Producer = new Producer();
            
            Producer.start();
            Producer.join();
            queue.remove(-1);
        }
        System.out.println(queue);
    }
}
