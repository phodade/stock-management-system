package patterns;

public class P6_1 {
	public static void main(String[] args) {
        int n = 4;  
        int num = 1; 

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
            	if(r<=c)
            	{
                System.out.print(num + " ");
                num ++; 
            }
            	else
            		System.out.print("  ");
        }
            System.out.println();
            
    }

}
}
