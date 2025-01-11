class exer1 {
    public void cgpa(int sub1, int sub2, int sub3) {
        double totalmarks = sub1 + sub2 + sub3;
        double Percentage = (totalmarks / 150) * 100;
        System.out.println("CGPA : " + Percentage / 9.5);
        System.out.println("Percentage : " + Percentage);
    }
}

public class ex_1 {
    public static void main(String[] args) {
        exer1 TAG = new exer1();
        TAG.cgpa(44, 45, 39);
    }
}