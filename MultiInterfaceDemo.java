interface Add {
    int add(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

class Cal implements Add, Sub {
    public int add (int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}


class MultiInterfaceDemo {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println("Addition: "+c.add(10,20));
        System.out.println("Substraction: "+c.sub(40, 20));
    }
}
