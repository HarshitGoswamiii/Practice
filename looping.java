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
            a++;
        } while (a < 20);
    }

    public void for_looping() {
        for (int i = a; i <= 20; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}

public class looping {
    public static void main(String[] args) {
        loops looping = new loops();
        looping.for_looping();
    }

}
