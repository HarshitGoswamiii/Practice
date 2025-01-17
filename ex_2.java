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
        System.out.println(Spaces.replace(" ", "-"));
    }

    // For Creating Template
    public void Template(String name) {
        String Letter = "Dear </name/>, Thanks ALot !";
        System.out.println(Letter.replace("</name/>", name));
    }

    // For finding the index of double space and triple space
    public void detection(String Line) {
        System.out.println(Line.indexOf("  "));
        System.out.println(Line.indexOf("   "));
    }
}

class ex_2 {
    public static void main(String[] args) {
        practice prc = new practice();
        // prc.encryption('a');
        // prc.expression();

        stringss str = new stringss();

        // str.converion("Harshit");
        // str.removal_space("I Am Kings !");
        // str.Template("Harshit Goswami");
        // str.Template("Arjun");
        // str.detection("I am Harshit Goswmai ");
    }
}
