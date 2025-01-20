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

}

public class pattern {
    static public void main(String[] args) {

        patterning ptr = new patterning();
        // ptr.patterns();
        // ptr.addition(5);
        ptr.multiplication_table(7);
    }
}
