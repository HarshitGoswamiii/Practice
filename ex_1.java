
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

    // Question 4
    public void odd_even(int digit) {
        int num = digit;
        if (num % 2 == 0) {
            System.out.println(num + " is an even number !");
        } else {
            System.out.println(num + " is an odd number !");
        }
    }

    // Question 5
    public void vowel(char alphabet) {
        char alpha = alphabet;
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println(alpha + " is vowel");
        } else {
            System.out.println(alpha + " is consonant");
        }
    }

    // Question 6
    public void largest(int num1, int num2, int num3) {
        int n1 = num1;
        int n2 = num2;
        int n3 = num3;
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest !");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is largest !");
        } else {
            System.out.println(n3 + " is largest !");
        }
    }

    // Question 7
    public void leapyear(int y) {
        int year = y;
        if (year % 4 == 0) {
            System.out.println(year + " is leap year !");
        } else {
            System.out.println(year + " is not leap year !");
        }
    }

    // Question 8
    public void sign(double number) {
        double numb = number;
        if (numb < 0.0) {
            System.out.println(numb + " is negative !");
        } else if (numb > 0.0) {
            System.out.println(numb + " is positive !");
        } else {
            System.out.println(numb + " is Zero or 0 !");
        }
    }

    // Question 9
    public void alphabet(char alpa) {
        if (alpa >= 'A' && alpa <= 'Z' || alpa >= 'a' && alpa <= 'z') {
            System.out.println(alpa + " is alphabet. ");
        } else {
            System.out.println(alpa + " is not alphabet.");
        }
    }

    // Question 10
    public void sum_of_n(int range) {
        int sum = 0;
        for (int i = 0; i <= range; ++i) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }

    // Question 11
    public void factorial(int fac) {
        int fact = 1;
        for (int i = fac; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + fac + " : " + fact);
    }

    // Question 12
    public void table(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " : " + (number * i));
        }
    }

    // Question 13
    public void fibonacci(int n) {
        int firstTerm = 0;
        int SecondTerm = 1;
        System.out.println("Fibonacci Series Till " + n + " Terms !");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + ", ");
            int NextTerm = firstTerm + SecondTerm;
            firstTerm = SecondTerm;
            SecondTerm = NextTerm;
        }
    }

    // Question 14
    public void alphabet_display() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + ", ");
        }
    }

    // Question 15
    public void count_of_digits(int num) {
        int count = 0;
        int n = num;
        for (; num != 0; num /= 10, ++count) {
        }
        System.out.println(n + " has " + count + " digits");
    }

    // Question 16
    public void reverse_number(int number) {
        System.out.println("Before : " + number);
        int reverse = 0;
        while (number != 0) {
            int digits = number % 10;
            reverse = reverse * 10 + digits;
            number /= 10;
        }
        System.out.println("After : " + reverse);
    }

    // Question 17
    public void power_of_number(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        System.out.println(result);
    }

    // Question 18
    public void palindrome(int number) {
        int num = number;
        System.out.println("Original Number : " + number);
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number : " + reverse);
        if (num == reverse) {
            System.out.println("It is A Palidrome Number !");
        } else {
            System.out.println("It is Not A Palidrome Number !");
        }
    }

    // Question 19
    public void prime(int number) {
        boolean flag = false;
        if (number == 0 || number == 1) {
            flag = true;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("It is Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }
    }

    // Question 20
    public void prime_intervals(int low, int high) {
        while (low < high) {
            boolean flag = false;
            for (int i = 2; i < low / 2; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && low == 0 && low == 1) {
                System.out.print(low + ", ");
            }
            ++low;
        }
    }
}

public class ex_1 {
    public static void main(String[] args) {
        exer1 tag = new exer1();
        // TAG.cgpa(44, 45, 39);
        // TAG.divide(25, 4);
        // tag.swapping(21, 43);
        // tag.odd_even(7);
        // tag.vowel('i');
        // tag.largest(5, 7, 12);
        // tag.leapyear(2024);
        // tag.sign(32.2);
        // tag.alphabet('j');
        // tag.sum_of_n(10);
        // tag.factorial(6);
        // tag.table(4);
        // tag.fibonacci(10);
        // tag.alphabet_display();
        // tag.count_of_digits(21332156);
        // tag.reverse_number(123639);
        // tag.power_of_number(2, 4);
        // tag.palindrome(127921);
        // tag.prime(7);
        tag.prime_intervals(10, 20);
    }
}