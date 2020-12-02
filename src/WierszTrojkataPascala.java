public class WierszTrojkataPascala {
    private int n;
    private int[] arr;

    public WierszTrojkataPascala(int n) {
        this.n = n;
//        arr = new int[n+1];
        arr = createRow(n);
    }

    private int[] createRow(int n) {
        if (n==0) return new int[]{ 1 };
        if (n==1) return new int[]{ 1, 1 };
        int[] tmp = {1,1};
        for (int i = 2; i <= n; i++) {
            int[] a = new int[i+1];
            a[0] = 1;
            a[i] = 1;
            for (int j = 1; j < i; j++) {
                a[j] = tmp[j] + tmp[j-1];
            }
            tmp = a;
        }
        return tmp;
    }

    public String calc(String arg) {
        try {
            int k = Integer.parseInt(arg);
            if (k<0 || k>n) return "liczba spoza zakresu";
            return String.valueOf(arr[k]);
        } catch (NumberFormatException e) {
            return "nieprawidlowa dana";
        }

    }
}
