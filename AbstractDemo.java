// Program to demonstarte Abstarct CLass and Abstarct Method
abstract class ADemo {
    abstract void display();

    void m1() {
        System.out.println("This is Concrete method");
    }
}


class BDemo extends ADemo {
    void display() {
        System.err.println("Display Method Implementation");
    }
}


class AbstractDemo {
    public static void main(String[] args) {
        BDemo b = new BDemo();
        b.display();
        b.m1();
    }
}
