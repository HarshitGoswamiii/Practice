class loops {
    int a = 1;

    public void while_looping() {
        while (a < 200) {
            System.out.println(a);
            a++;
        }
    }

    public void do_looping() {
        do {
            System.out.println(a);
            a++;
        } while (a < 20);
    }

    public void for_looping() {
        for (int i = 20; i >= a; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

public class looping {
    public static void main(String[] args) {
        loops looping = new loops();
        looping.for_looping();
    }

}
