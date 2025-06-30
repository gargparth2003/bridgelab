
/*
public class MyClass {
    public static void void myMethod(int a) {
        a = 5;
        int b = 2;
        System.out.println("Inside myMethod: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        myMethod(10);
    }
}
*/

// New class with static and non-static variables
class AnotherClass {
    // static int a = 5;    // static variable
    // int b = 10;          // non-static (instance) variable
}

public class MyClass {
    public static void main(String[] args) {
        // Access static variable directly by class name
        // System.out.println("Static variable a: " + AnotherClass.a);

        // // Access non-static variable by creating an object
        // AnotherClass obj = new AnotherClass();
        // System.out.println("Non-static variable b: " + obj.b);

        int a = 1 ;
        int b = 2  ;
        int c =  a+ b ;
        int d = a - b ;
        System.out.println(c);
        System.out.println(d);

    }
}

