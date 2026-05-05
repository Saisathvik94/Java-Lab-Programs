// Program to implementing producer consumer problem using inter Thread Communication
class Bbuffer{
    int data;
    boolean hasData = false;
    // Produce Method
    synchronized void produce(int value) {
        while(hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        }

        data = value;
        System.out.println("Produced: "+ data);
        hasData = true;
        notify();
    }

    // Consumer Method
    synchronized void consumer() {
        while(!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        }
        System.out.println("Consumed: "+ data);
        hasData = false;
        notify();
    }
}


// Producer class
class producer extends Thread {
    Bbuffer b;
    producer(Bbuffer b) {
        this.b = b;
    }
    public void run() {
        for(int i =1; i<=5; i++) {
            b.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        }
    }
}

// Consumer Class
class consumer extends Thread {
    Bbuffer b;

    consumer(Bbuffer b) {
        this.b = b;
    }

    public void run() {
        for(int i =1; i<=5; i++) {
            b.consumer();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        }
    }
    
}

class ProducerConsumerDemo {
    public static void main(String[] args) {
        Bbuffer b = new Bbuffer();
        producer p = new producer(b);
        consumer c = new consumer(b);
        p.start();
        c.start();
    }
}
