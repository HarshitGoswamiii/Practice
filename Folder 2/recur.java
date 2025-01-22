public class recur {

    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    // Fibonacci Series By Simple Approach
    static void fibonacci(int number) {
        // For Printing
        System.out.println("Fibonacci Series : ");
        // Assigning the value ot variable
        int start = 0, second = 1, nextTerm = 0;
        // Loop for Repetition until the start became equal to number
        while (start < number) {
            System.out.print(nextTerm + ", ");
            start = second; // Stores the value of second into start vairable
            second = nextTerm; // Stores the value of next term into the second variable
            nextTerm = start + second; // Adding the new assigned value to next term
        }
    }

    // Fibonacci Series By Recursive Approach
    static int fibonacci_recursive(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci_recursive(number - 1) + fibonacci_recursive(number - 2);
    }

    public static void main(String[] args) {

        recur obj1 = new recur();
        // System.out.println(obj1.factorial(5));
        // obj1.fibonacci(10);
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci_recursive(i) + ", ");
        }
    }
}
