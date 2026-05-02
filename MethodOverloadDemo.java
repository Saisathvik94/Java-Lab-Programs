class OverloadDemo {
    void display() {
        System.out.println("Super Class Method");
    }
    void display(int i) {
        System.out.println("Value of i: "+i);
    }
}

class MethodOverloadDemo {
    public static void main(String[] args) {
        OverloadDemo o = new OverloadDemo();
        o.display();
        o.display(10);
    }
}
