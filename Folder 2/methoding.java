public class methoding {
    int mysum(int a, int b) {
        int c = a + b;
        return c;
    }

    void mysum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    static void sum(int a, int... arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        System.out.println(result);
    }

    // <---------------------------------------------MainMethods--------------------------------------------------->
    public static void main(String[] args) {
        methoding obj = new methoding();
        // System.out.println(obj.mysum(98, 31));
        // int[] arr1 = { 23, 43, 2, 11, 43 };
        // obj.mysum(arr1);
        obj.sum(21, 21, 33, 32);
    }
}
