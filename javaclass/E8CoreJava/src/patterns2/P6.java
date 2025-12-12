package patterns2;

public class P6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {   // start j from 0
                if (i > j)                  // condition you requested
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
