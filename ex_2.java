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

    // For Conversion of string to lower case
    public void converion(String name) {
        // System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }

    // For Removing spaces/blank from string
    public void removal_space(String Spaces) {

    }
}

class ex_2 {
    public static void main(String[] args) {
        practice prc = new practice();
        // prc.encryption('a');
        // prc.expression();

        stringss str = new stringss();

        // str.converion("Harshit");

    }
}
