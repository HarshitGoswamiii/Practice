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
                for (int k = 0; k < arr2[j].length; k++) {
                    System.out.print(arr2[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }

    // Question 1
    public void question_1() {
        float sum = 0;
        float[] arrey1 = { 2.4f, 8.3f, 3.5f, 9.6f, 9.3f };
        for (int i = 0; i < arrey1.length; i++) {
            sum += arrey1[i];
        }
        System.out.println(sum);
    }

    public void question_2(int number) {
        int[] arrey2 = { 21, 23, 43, 44, 63, 22 };
        boolean aering = false;
        System.out.println("Entered Number : " + number);
        for (int i = 0; i < arrey2.length; i++) {
            if (arrey2[i] == number) {
                aering = true;
            }
        }
        if (!aering) {
            System.out.println("Present !");
        } else {
            System.out.println("Not Present !");
        }
    }
}

public class practice_for_array {
    public static void main(String[] args) {
        arrayss prc = new arrayss();
        // prc.practice();
        // prc.md_arrays();
        // prc.question_1();
        prc.question_2(23);
    }
}