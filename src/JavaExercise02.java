public class JavaExercise02 {
    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = true;
        c = true;


        System.out.println("   A   -   B   -   C   >  Statement");
        System.out.println("---------------------------------");

        do {
            a = !a;
            do {
                b = !b;
                do {
                    c = !c;

                    if (a) {
                        System.out.print(" ");
                    }

                    System.out.print("(" + a + ") (");

                    if (b) {
                        System.out.print(" ");
                    }

                    System.out.print(b + ") (");

                    if (c) {
                        System.out.print(" ");
                    }
                    System.out.print(c + ") > (");
                    //hier den Ausdruck zum überprüfen ändern!!!!!------------------------------------------------------
                    System.out.println((!(a^b)||b) + ")");

                    System.out.println("---------------------------------");
                }
                while (c == false);
            }
            while (b == false);
        }
        while (a == false);

    }

}
