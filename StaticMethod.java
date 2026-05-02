// Program to Find the Total and Average of Two Numbers using Static Methods
class StaticMethod {
    public static void method(int a, int b) {
        int total = a + b;
        int avg = total / 2;
        System.out.println("The Sum of Two Numbers is :"+ total);
        System.out.println("The Average of Two Numbers is :"+ avg);
    }

    public static void main(String[] args) {
        method(10, 20);
    }
}
