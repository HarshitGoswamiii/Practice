class patterning {
    public void patterns() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

public class pattern {
    static public void main(String[] args) {

        patterning ptr = new patterning();
        ptr.patterns();
    }
}
