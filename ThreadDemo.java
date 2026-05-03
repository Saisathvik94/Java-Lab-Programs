import java.io.*;

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("Thread: "+i);
        }
        System.out.println("End of Thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("End of Main Thread");
    }
}
