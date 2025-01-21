public class methoding {
    int mysum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        methoding obj = new methoding();
        System.out.println(obj.mysum(98, 31));
    }
}
