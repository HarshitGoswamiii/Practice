public class practice_set {

    // Question 1-->
    static void table(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*number);
        }
    }

    // Question 2-->
    static void pattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        practice_set prt = new practice_set();
        // prt.table(8);
        prt.pattern();
    }
}
