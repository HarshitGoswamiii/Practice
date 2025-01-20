class patterning {
    public void patterns() {
        for (int j = 5; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public void addition(int range) {
        int sum = 0, i = 0;
        while (i <= range) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    public void multiplication_table(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " : " + (number * i));
            i++;
        }
    }

    public void reverse_table(int number) {
        int i = 10;
        while (i >= 1) {
            System.out.println(number + " * " + i + " : " + (number * i));
            i--;
        }
    }

    public void factorial(int value) {
        int facts = 1;
        for (int i = value; i >= 0; i++) {
            facts *= i;
        }
        System.out.println(facts);
    }

}

public class pattern {
    static public void main(String[] args) {

        patterning ptr = new patterning();
        // ptr.patterns();
        // ptr.addition(5);
        // ptr.multiplication_table(7);
        // ptr.reverse_table(2);
        ptr.factorial(5);
    }
}
