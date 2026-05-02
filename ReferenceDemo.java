class ReferenceDemo {
    int x = 100;
    void display (ReferenceDemo R) {
        R.x = R.x + 100;
    }

    public static void main(String[] args) {
        ReferenceDemo r = new ReferenceDemo();
        System.out.println("Before Calling: "+ r.x);
        r.display(r);
        System.out.println("After Calling: "+ r.x);
    }
}
