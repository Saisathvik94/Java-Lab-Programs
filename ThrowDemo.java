class ThrowDemo {
    void divide(int i, int j) throws ArithmeticException {
        if(j==0) {
            throw new ArithmeticException("Demo Exception");
        }
        int c = i/j;
        System.out.println(c);
    }
    public static void main(String args[]) {
        ThrowDemo t = new ThrowDemo();
        t.divide(2, 0);
    }
}
