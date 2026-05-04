// Program to create Multiple Thread by Extending thread class using Thread Priorites

import java.io.*;

class PriorityDemo extends Thread {
    String name;

    PriorityDemo(String s) {
        name = s;
    }

    public void run() {
        try {
            for (int i = 1; i<=3; i++) {
                System.out.println("Thread: "+name);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

class MainPriority {
    public static void main(String[] args) {
        PriorityDemo p1 = new PriorityDemo("A");
        PriorityDemo p2 = new PriorityDemo("B");
        PriorityDemo p3 = new PriorityDemo("C");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(10);

        System.out.println("Priority of A thread: "+ p1.getPriority());
        System.out.println("Priority of B thread: "+ p2.getPriority());
        System.out.println("Priority of C thread: "+ p3.getPriority());

        p1.start();
        p2.start();
        p3.start();

        Thread t = Thread.currentThread();
        System.out.println("Thread name: "+ t.getName());

    }
}
