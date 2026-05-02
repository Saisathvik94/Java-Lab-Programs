class superdemo {
    void display() {
        System.out.println("Super Class Method");
    }
}

class subclass extends superdemo {
    void call() {
        System.out.println("Subclass Method");
    }
}

class SingleInheritance {
    public static void main(String args[]) {
        subclass s = new subclass();
        s.display();
        s.call();
    }
}
