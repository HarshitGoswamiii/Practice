import javax.swing.text.html.HTML.Tag;

class exer1 {

    // Question 1
    public void cgpa(int sub1, int sub2, int sub3) {
        double totalmarks = sub1 + sub2 + sub3;
        double Percentage = (totalmarks / 150) * 100;
        System.out.println("CGPA : " + Percentage / 9.5);
        System.out.println("Percentage : " + Percentage);
    }

    // Question 2
    public void divide(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("Quotient : " + quotient);
        System.out.println("Reminder : " + reminder);
    }

    // Question 3
    public void swapping(int first, int second) {
        int temp;
        int f1 = first;
        int f2 = second;
        System.out.println("Before Swapping :  " + f1 + " | " + f2);
        temp = f1;
        f1 = f2;
        f2 = temp;
        System.out.println("After Swapping :  " + f1 + " | " + f2);
    }
}

public class ex_1 {
    public static void main(String[] args) {
        exer1 tag = new exer1();
        // TAG.cgpa(44, 45, 39);
        // TAG.divide(25, 4);
        tag.swapping(21, 43);
    }
}