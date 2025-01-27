class patterning {
    // Quetion 1
    public void patterns() {
        for (int j = 5; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // Quetion 2
    public void addition(int range) {
        int sum = 0, i = 0;
        while (i <= range) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    // Quetion 3
    public void multiplication_table(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " : " + (number * i));
            i++;
        }
    }

    // Quetion 4
    public void reverse_table(int number) {
        int i = 10;
        while (i >= 1) {
            System.out.println(number + " * " + i + " : " + (number * i));
            i--;
        }
    }

    // Quetion 5
    public void factorial(int value) {
        int facts = 1, i = value;
        // for (int i = value; i > 0; i--) {
        // facts *= i;
        // }
        while (i >= 1) {
            facts *= i;
            i--;
        }
        System.out.println(facts);
    }

    // Quetion 6
    // Pyramid using while loop
    public void pyramid_while() {
        int range = 5, i = 1;
        while (i <= range) {
            int j = 1;
            while (j <= i) {
                System.out.print(" *");
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }

    // Quetion 7
    public void sum_of_table_8() {
        int sum = 0, i = 1;
        // for (int i = 1; i <= 10; i++) {
        // sum += (8 * i);
        // }
        while (i <= 10) {
            sum += (8 * i);
            i++;
        }
        System.out.println("The Sum of number : " + sum);
    }

    // Quetion 8
    public void sum_using_forloop() {
        int number = 5, sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

public class pattern {
    static public void main(String[] args) {

        patterning ptr = new patterning();
        // ptr.patterns();
        // ptr.addition(5);
        // ptr.multiplication_table(7);
        // ptr.reverse_table(2);
        // ptr.factorial(6);
        // ptr.pyramid_while();
        // ptr.sum_of_table_8();
        // ptr.sum_using_forloop();
        

        
    }
}
