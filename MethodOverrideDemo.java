// Program for Method Override

class OverrideDemo {
    void display() {
        System.out.println("Super Class Method");
    }
}

class MethodOverrideDemo extends OverrideDemo {
    @Override void display() {
        System.out.println("Sub Class Method");
    }
    public static void main(String[] args) {
        MethodOverrideDemo d = new MethodOverrideDemo();
        d.display();
    }
}
