// Program to Find Total and Average Using Command Line Argument
class CmdEx {
    public void method1(int a, int b) {
        int c = a+b;
        int avg = c/2;
        System.out.println("The Sum of Two Numbers is :"+ c);
        System.out.println("The Average of Two Numbers is :"+ avg);
    }
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        CmdEx c = new CmdEx();
        c.method1(x, y);
    }
}
