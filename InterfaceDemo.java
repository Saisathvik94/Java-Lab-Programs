interface testInterface {
    final int a = 10;
    void display();
}

class testclass implements testInterface {
    public void display() {
        System.out.println("Implementing Interface");
    }
} 

class InterfaceDemo {
    public static void main(String[] args) {
        testclass t = new testclass();

        t.display();
        System.out.println(t.a);
    }
}
