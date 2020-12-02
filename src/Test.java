public class Test {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            if (n<0) {
                System.out.println("Nieprawidlowy numer wiersza");
            } else {
                WierszTrojkataPascala row = new WierszTrojkataPascala(n);
                for (int i = 1; i < args.length; i++) {
                    System.out.println(args[i] + " - " + row.calc(args[i]));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidlowy numer wiersza");
        }
    }
}

// java Test 4 0 1 3 8 -1 aaaa
/*
        0 - 1
        1 - 4
        2 - 6
        8 - liczba spoza zakresu
        -1 - liczba spoza zakresu
        aaaa - nieprawidªowa dana
 */