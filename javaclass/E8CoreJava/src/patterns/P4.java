package patterns;

public class P4 {
    public static void main(String[] args) {
        int n = 4;

        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }
            char digit = (r % 2 == 1) ? '0' : '1';
            for (int c = 1; c <= r; c++) {
                System.out.print(digit + " ");
            }

            System.out.println();
        }
    }
}
