package patterns2;

public class P5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
