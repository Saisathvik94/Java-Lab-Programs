class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10,b;
            b = a/0;
            System.out.println("Value"+ b);
        } catch(ArithmeticException e){
            System.out.println("Exception Raised Division by Zero");
        }
        System.out.println("Quit");
    }
}
