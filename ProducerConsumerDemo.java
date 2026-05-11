class SharedBuffer 
{
    private int data;
    private boolean hasData = false;

    // Producer method
    public synchronized void produce(int value) {
        try {
            // Wait if data is already available
            while (hasData) {
                wait();
            }

            data = value;
            System.out.println("Produced: " + data);
            hasData = true;

            // Notify consumer
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Consumer method
    public synchronized void consume() {
        try {
            // Wait if no data
            while (!hasData) {
                wait();
            }

            System.out.println("Consumed: " + data);
            hasData = false;

            // Notify producer
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

//Producer Thread
class Producer extends Thread 
{
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

//Consumer Thread
class Consumer extends Thread {
    SharedBuffer buffer;
    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

//Main Class
public class ProducerConsumerDemo 
{
    public static void main(String[] args) 
     {
        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
