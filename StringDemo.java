class StringDemo {
    public static void main(String[] args) {
        // Create a String
        String s = "Hello!World";
        System.out.println("String: "+ s);

        // get length of String
        int len = s.length();
        System.out.println("Length of String s: "+ len);

        // Display Character at a Position
        String mystr = "VJIT";
        char result = mystr.charAt(2);
        System.out.println(result);

        // Join Two Strings
        String first = "Java";
        System.out.println("First String: "+ first);
        String second = "Programming";
        System.out.println("Second String: "+ second);
        String Joined = first.concat(second);
        System.out.println("Joined String: "+ Joined);

        // Sub String
        String st = "Hello World!";
        System.out.println(st.substring(7,12));

        // Compare Strings
        String s1 = "Java Programming";
        String s2 = "Java Programming";
        String s3 = "Python Programming";

        // Compare First & Second strings
        boolean result1 = s1.equals(s2);
        System.out.println("String First and Second are Equal: "+ result1);

        // Compare First and Third strings
        boolean result2 = s1.equals(s3);
        System.out.println("String First and Third are Equal: "+ result2);

        // Replace
        String st1 = "Hello";
        System.out.println(st1.replace("l", "p"));

        // Convert Upper and Lower Case
        String txt = "HelloWorld";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        // Trim
        String str = "  JavaWorld!";
        System.out.println(str);
        System.out.println(str.trim());
    }    
}
