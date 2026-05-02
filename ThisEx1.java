// Program to Find the Total and Average using This Keyword
class ThisEx1 {
    int a, b;
    public void method1(int a, int b) {
        this.a = a;
        this.b = b;
        int c = a + b;
        int avg = c/2;

        System.out.println("The Sum of Two Numbers is :"+ c);
        System.out.println("The Average of Two Numbers is :"+ avg);
    }

    public static void main(String args[]) {
        ThisEx1 s = new ThisEx1();
        s.method1(30,40);
    }
}