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
        int[][][] arr2 = new int[2][2][2];
        arr2[0][0][0] = 100;
        arr2[0][1][1] = 103;
        arr2[1][0][0] = 213;
        arr2[1][1][1] = 243;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for(int k=0;k<arr2[j].length;k++){
                    System.out.print(arr2[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}

public class practice_for_array {
    public static void main(String[] args) {
        arrayss prc = new arrayss();
        // prc.practice();
        prc.md_arrays();
    }
}