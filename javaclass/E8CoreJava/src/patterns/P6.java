package patterns;

public class P6 {
    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        for (int r = 1; r <= n; r++) {
            for (int s = 1; s < r; s++) {
                System.out.print("  "); 
            }

            for (int c = r; c <= n; c++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
