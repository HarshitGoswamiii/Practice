class loops {
    public void while_looping() {
        int a = 10;
        while (a < 200) {
            System.out.println(a);
            a++;
        }
    }
}

public class looping {
    public static void main(String[] args) {
        loops looping = new loops();
        looping.while_looping();
    }

}
