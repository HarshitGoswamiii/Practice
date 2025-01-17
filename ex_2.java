class practice {
    public void encryption(char grade) {
        System.out.println((char) (grade + 3));
    }

    // Question 2
    public void expression() {
        System.out.println("((v*v)-(u*u))/2as"); 
    }
}

class ex_2 {
    public static void main(String[] args) {
        practice prc = new practice();

        prc.encryption('a');
    }
}
