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

    // Question 4
    static void pyramid_upside() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // Question 5
    static int fibonacci_series(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci_series(number - 1) + fibonacci_series(number - 2);
    }

    // Question 6
    static void average(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Total Marks : " + sum);
        System.out.println("Average : " + (sum / numbers.length));
    }

    // Question 8----->
    static void pattern_rec_2(){
        int n=4;
        if(n==1){
            System.out.println("*");
        }
        System.out.println();
    }

    // Question 9
    static void temp_conversion(double temperature) {
        System.out.println("Temperature in Celsius : " + temperature + "°"); // Print The Temperature in Celsius
        // Convert the temperature by multiplication of celcius tempertaure
        double fahrenhiet = (temperature * 1.8) + 32;
        System.out.println("Temperature in Fahrenhiet : " + fahrenhiet + "°"); // Print The Tempertare in Fahrenhiet
    }

    public static void main(String[] args) {

        practice_set prt = new practice_set();
        // prt.table(8);
        // prt.pattern();
        // System.out.println(prt.sum_of_n(5));
        // prt.pyramid_upside();
        // prt.pattern2();
        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // System.out.print(fibonacci_series(i) + ", ");
        // }
        // prt.temp_conversion(0.2);
        prt.average(26, 32, 21, 44, 28, 65);
    }
}
