class loops {
    int a = 10;

    public void while_looping() {
        while (a < 200) {
            System.out.println(a);
            a++;
        }
    }

    public void do_looping() {
        do {
            System.out.println(a);
        } while (a < 20);
    }
}

public class looping {
    public static void main(String[] args) {
        loops looping = new loops();
        looping.do_looping();
    }

}
