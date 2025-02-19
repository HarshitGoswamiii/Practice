class examples {
    public void counting_digits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            ++count;
        }
        System.out.println("Total Digits : " + count);

    }

    public void palindrome_str(String name) {
        String Reverse_Str = "";
        int str_length = name.length();
        for (int i = (str_length - 1); i >= 0; --i) {
            Reverse_Str = Reverse_Str + name.charAt(i);
        }
        if (name.toLowerCase().equals(Reverse_Str.toLowerCase())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not A Palindrome String");
        }
    }

    public void palindrome_num(int number) {
        int Reverse_num = 0, reminder;
        int originak = number;
        while (number != 0) {
            reminder = number % 10;
            Reverse_num = Reverse_num * 10 + number;
        }
        System.out.println(Reverse_num);
    }
}

public class questions {
    public static void main(String[] args) {
        examples hello = new examples();
        // hello.palindrome_str("ada");
        // hello.counting_digits(1220);
        hello.palindrome_num(1223);
    }
}