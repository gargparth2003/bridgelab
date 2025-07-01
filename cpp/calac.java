public class calac {
    static int x = 5;  // static variable
    static int y = 10; // static variable

    // private static function that returns x + y
    private static int sum() {
        return x + y;
    }

    public static void main(String[] args) {
        
        int result = sum();
        System.out.println("Sum of x and y: " + result);
    }
}

