public class practice_set {

    // Question 1-->
    static void table(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*number);
        }
    }
    public static void main(String[] args) {

        practice_set prt = new practice_set();
        prt.table(8);
    }
}
