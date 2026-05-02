class ArithmeticDemo {
    public void add1(int a, int b) {
        int c = a + b;
        System.out.println("The Addition of Two Numbers is : "+ c);
    }   
    public void substarct1(int a, int b) {
        int c = a - b;
        System.out.println("The Substraction of Two Numbers is : "+ c);
    }   
    public void multiply1(int a, int b) {
        int c = a * b;
        System.out.println("The Multiplication of Two Numbers is : "+ c);
    }   
    public void division1(int a, int b) {
        int c = a / b;
        System.out.println("The Division of Two Numbers is : "+ c);
    }   

    public static void main(String args[]) {
        ArithmeticDemo d = new ArithmeticDemo();
        d.add1(10,20);
        d.substarct1(40, 20);
        d.multiply1(10, 10);
        d.division1(40, 20);
    }
}