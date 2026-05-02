class Demo {
    final void m1() {
        System.out.println("Super class Method");
    }
}

class FinalDemo extends Demo{
    void m1() {
        System.out.println("Sub class Method");
    }
    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.m1();
    }
}
