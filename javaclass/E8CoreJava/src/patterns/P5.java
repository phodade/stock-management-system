package patterns;

public class P5 {
	public static void main(String[] args) {
        int n = 3;  
        int num = 2; 

        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(num + " ");
                num += 2; 
            }
            System.out.println();
        }
    }
}
