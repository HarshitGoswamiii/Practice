
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

class Tax {
    public void income_tax(int income) {
        int tax, tax2, tax3, total_tax = 0;
        System.out.println("Income : " + income);
        if (income < 249999) {
            System.out.println("No Tax !");
        } else if (income > 250000 || income < 499999) {
            tax = income * 5 / 100;
            total_tax = total_tax + tax;
        } else if (income > 500000 || income < 999999) {
            tax2 = income * 20 / 100;
            total_tax = total_tax + tax2;
        } else if (income < 1000000) {
            tax3 = income * 30 / 100;
            total_tax = total_tax + tax3;
        }

        System.out.println("Total Ammount Payable : " + income + total_tax);
    }
}

public class Conditionals {
    public static void main(String[] args) {

        // Grade hello = new Grade();
        // hello.passing_marks(43, 54, 48);
    }
}
