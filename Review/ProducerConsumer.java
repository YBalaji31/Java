import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable {
    private List<Integer> buffer;
    private int maxSize;

    public Producer(List<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    public void run() {
        int counter = 1;
        while (true) {
            try {
		counter++;
                produce(counter);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int item) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == maxSize) {
                System.out.println("Producer Waiting");
                buffer.wait();
            }

            buffer.add(item);
            System.out.println("Produced: " + item+" Size :"+buffer.size());
            buffer.notifyAll();
        }
    }
}

class Consumer implements Runnable {
    private List<Integer> buffer;

    public Consumer(List<Integer> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                System.out.println("Consumer Waiting");
                buffer.wait();
            }

            int item = buffer.remove(0);
            System.out.println("Consumed: " + item+" Size :"+buffer.size());
            buffer.notifyAll();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> buffer = new ArrayList<>();
        int maxSize = 5;

        Thread producerThread = new Thread(new Producer(buffer, maxSize));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
