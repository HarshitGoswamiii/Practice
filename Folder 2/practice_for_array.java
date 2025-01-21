class arrayss {
    public void practice() {
        int[] arr1 = { 10, 23, 13, 32, 33 };
        // for (int i = arr1.length - 1; i >= 0; i--) {
        // System.out.print(arr1[i] + ", ");
        // }
        for (int element : arr1) {
            System.out.print(element + ", ");
        }
    }

    public void md_arrays() {
        int[][] arr2 = new int[2][2];
        arr2[0][0] = 100;
    }
}

public class practice_for_array {
    public static void main(String[] args) {
        arrayss prc = new arrayss();
        prc.practice();
    }
}