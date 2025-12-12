package patterns;

public class P1 {
    public static void main(String[] args) {
        int n = 4;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r + c <= n + 1) {
                    if (c % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
