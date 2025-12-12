package loopingStatements;

public class PEvenOrPOddNEvenOrNOdd {
    public static void main(String[] args) {
        int n = 3;

        if (n > 0) 
        {
            if (n % 2 == 0) 
            {
                System.out.println(n + " is positive even");
            }
            else 
            {
                System.out.println(n + " is positive odd");
            }
        } 
        else if (n < 0) 
        {
            if (n % 2 == 0)
            {
                System.out.println(n + " is negative even");
            } else 
            {
                System.out.println(n + " is negative odd");
            }
        } 
    }
}
