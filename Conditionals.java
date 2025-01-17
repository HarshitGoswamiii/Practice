
class Grade {

    public void passing_marks(int subject_1, int subject_2, int subject_3) {
        double result = ((subject_1 + subject_2 + subject_3) / 300.0) * 100;
        String Formatted = String.format("%.2f", result);
        System.out.println("Percentage : " + Formatted + "%");
        if (subject_1 >= 33 && subject_2 >= 33 && subject_3 >= 33) {
            if (result >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}

public class Conditionals {
    public static void main(String[] args) {
        Grade hello = new Grade();
        hello.passing_marks(43, 54, 48);
    }
}
