// Program for Thread Synchronization using Synchronized Block

class SyncThread {
    void call(String name) {
        for(int i = 1; i<=5; i++) {
            System.out.println("Thread: "+ name);
        }
    }
}

class MyThread1 extends Thread {
    SyncThread st;
    String s;
    MyThread1(SyncThread st1, String s1) {
        st = st1;
        s = s1;
    }

    public void run() {
        synchronized (st) {
            st.call(s);
        }
    }
}

class SyncBlockThread {
    public static void main(String[] args) {
        SyncThread st = new SyncThread();
        MyThread1 t1 = new MyThread1(st, "Hai");
        MyThread1 t2 = new MyThread1(st, "Hello");
        MyThread1 t3 = new MyThread1(st, "Welcome");
        t1.start();
        t2.start();
        t3.start();
    }
}
