public class recur {

    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    // Fibonacci Series Using Recursion
    static void fibonacci(int number) {
        System.out.println("Fibonacci Series : ");
        int start = 0, second = 1, nextTerm = 0;
        while (start < number) {
            System.out.print(nextTerm + ", ");
            start = second;
            second = nextTerm;
            nextTerm = start + second;
        }
    }

    public static void main(String[] args) {

        recur obj1 = new recur();
        // System.out.println(obj1.factorial(5));
        obj1.fibonacci(10);

    }
}
