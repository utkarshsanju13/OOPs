package Threading_Concurrency_Synchronization.ThreadPrintingNumbers;

class ProducerConsumer {
    private static final int MAX = 10; // Max items in the queue
    private int count = 0; // Current count of items in the queue

    // Shared resource: a simple queue simulated by count
    public synchronized void produce() throws InterruptedException {
        while (count == MAX) {
            wait();  // Wait if the queue is full
        }
        count++;
        System.out.println("Produced: " + count);
        notify();  // Notify consumer after producing
    }

    public synchronized void consume() throws InterruptedException {
        while (count == 0) {
            wait();  // Wait if the queue is empty
        }
        count--;
        System.out.println("Consumed: " + count);
        notify();  // Notify producer after consuming
    }
}

public class ProducerConusmerProblem {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    pc.produce();
                    Thread.sleep(100); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 15; i++) {
                    pc.consume();
                    Thread.sleep(150); // Simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
