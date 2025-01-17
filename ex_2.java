class practice {
    public void encryption(char grade) {
        System.out.println((char) (grade + 3));
    }

    // Question 2
    public void expression() {
        System.out.println("((v*v)-(u*u))/2as");
    }
}

class stringss {
    public void converion(String name) {
        // System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}

class ex_2 {
    public static void main(String[] args) {
        practice prc = new practice();
        // prc.encryption('a');
        // prc.expression();

        stringss str = new stringss();
        str.converion("Harshit");
    }
}
