public class question {
    public void factorial(int number) {
        int multiple = 1;
        if (number == 0 || number == 1) {
            System.out.println(" 1 ");
        }
        while (number >= 1) {
            multiple *= number;
            number--;
        }
        System.out.println(multiple);
    }

    public static void main(String[] args) {

        question newObj = new question();
        newObj.factorial(5);
    }
}
