public class practice_set {

    // Question 1-->
    static void table(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * number);
        }
    }

    // Question 2-->
    static void pattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 3
    static int sum_of_n(int a) {
        if (a <= 0) {
            return 0;
        }
        int sum = a + sum_of_n(a - 1);
        return sum;
    }

    public static void main(String[] args) {

        practice_set prt = new practice_set();
        // prt.table(8);
        // prt.pattern();
        prt.sum_of_n(5);
    }
}
