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

    // Question 2
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
            System.out.println("Not Present !");
        } else {
            System.out.println("Present !");
        }
    }

    // Question 3
    public void marks() {
        int[] student_marks = { 34, 43, 55, 32, 51 };
        int sum = 0;
        for (int element : student_marks) {
            sum += element;
        }
        System.out.println("Average : " + (sum / (student_marks.length - 1)));
    }

    // Question 4
    public void two_D_matrix() {
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 32;
        arr1[0][1] = 36;
        arr1[0][2] = 76;
        arr1[1][0] = 98;
        arr1[1][1] = 22;
        arr1[1][2] = 64;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    // Question 4
    public void reverse_array() {
        int[] array = { 32, 54, 22, 63, 13 };
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    // Question 6
    public void maximum() {
        int[] array = { 32, 54, 22, 63, 13 };
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum Element : " + max);
    }

    // Question 7
    public void minimum() {
        int[] array = { 32, 54, 22, 63, 17 };
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("Maximum Element : " + min);
    }

    // Question 8
    public void sorted() {
        int[] array = { 32, 34, 54, 63, 77 };
        System.out.print("{ ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.println("}");
        boolean sort = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sort = false;
                break;
            }
        }
        if (!sort) {
            System.out.println("It is not sorted !");
        } else {
            System.out.println("It is sorted !");

        }
    }
}

public class practice_for_array {
    public static void main(String[] args) {
        arrayss prc = new arrayss();
        // prc.practice();
        // prc.md_arrays();
        // prc.question_1();
        // prc.question_2(29);
        // prc.marks();
        // prc.two_D_matrix();
        // prc.reverse_array();
        // prc.maximum();
        // prc.minimum();
        prc.sorted();
    }
}