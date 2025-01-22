public class recur {

    static public int factorial(int number) {
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        recur obj1 = new recur();
        obj1.factorial(3);
    }
}
