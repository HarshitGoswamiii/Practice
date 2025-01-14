class practice {
    public void encryption(char grade) {
        System.out.println((char) (grade + 3));
    }
}

class ex_2 {
    public static void main(String[] args) {
        practice prc = new practice();

        prc.encryption('a');
    }
}
