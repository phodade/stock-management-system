package patterns;

public class P3 {
    public static void main(String[] args) {
        int n = 4;

        for (int r = 1; r <= n; r++) {
            for (char ch = 'A'; ch < 'A' + r; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
