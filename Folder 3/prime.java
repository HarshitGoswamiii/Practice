import java.util.Scanner;

public class prime {
    static public void main(String[] args) {
        System.out.print("Enter Number ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is Prime!");
        } else {
            System.out.println(number + " is not Prime !");
        }

    }

    public boolean isPrime(int numb) {
        for (int i = 2; i < numb / 2; i++) {
            if (numb % i == 0) {

                return false;
            }
        }
        return true;
    }
}