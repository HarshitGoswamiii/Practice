public class recur {

    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    // Fibonacci Series Using Recursion
    static int fibonacci(int number) {
        int start = 0, second = 1, nextTerm = 0;
            


        return number;
    }

    public static void main(String[] args) {

        recur obj1 = new recur();
        System.out.println(obj1.factorial(5));

    }
}
