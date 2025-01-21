class arrayss {
    public void practice() {
        int[] arr1 = { 10, 23, 13, 32, 33 };
        for (int i = arr1.length; i < 1; i--) {
            System.out.print(arr1[i] + ", ");
        }
    }
}

public class practice_for_array {
    public static void main(String[] args) {
        arrayss prc = new arrayss();
        prc.practice();
    }
}