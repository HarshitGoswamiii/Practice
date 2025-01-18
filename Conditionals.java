
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
        int tax = 0, total_tax = 0;
        System.out.println("Income : " + income);
        if (income < 249999) {
            System.out.println("No Tax !");
        } else if (income > 250000 && income < 499999) {
            tax = (income - 250000) * 5 / 100;
            total_tax = total_tax + tax;
        } else if (income > 500000 && income < 999999) {
            tax = (income - 500000) * 20 / 100;
            total_tax = total_tax + tax + (250000 * 5 / 100);
        } else if (income < 1000000) {
            tax = (income - 1000000) * 30 / 100;
            total_tax = total_tax + tax + (250000 * 5 / 100) + (500000 * 20 / 100);
        }

        System.out.println("Tax Payable : " + total_tax);
    }
}

class practice_set {

    public void weekday(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sumday");
                break;
            default:
                System.out.println("Entered Number Is Incorrect !");
        }
    }

    // Question 6 :-
    public void website(String Website) {
        System.out.println("Website : " + Website);
        if (Website.endsWith(".com")) {
            System.out.println("Commercial Website.");
        } else if (Website.endsWith(".org")) {
            System.out.println("Organization Website.");
        } else if (Website.endsWith(".in")) {
            System.out.println("Indian Website.");
        }
    }
}

public class Conditionals {
    public static void main(String[] args) {

        // Grade hello = new Grade();
        // hello.passing_marks(43, 54, 48);

        // Tax income = new Tax();
        // income.income_tax(700000);

        // Practice
        practice_set prc = new practice_set();
        prc.weekday(9);
    }
}
