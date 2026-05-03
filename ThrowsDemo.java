class ThrowsDemo {
    void divide(int i, int j) throws ArithmeticException {
        int c = i / j;
        System.out.println(c);
    }
    public static void main(String args[]) {
        ThrowsDemo d = new ThrowsDemo();
        d.divide(2,0);
    }
}