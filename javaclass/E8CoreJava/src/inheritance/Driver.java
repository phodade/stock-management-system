package inheritance;

public class Driver {
    public static void main(String[] args) 
    {
        L1 l1 = new L1();
        
        L1 l1b = new L1(true);

        L2 l2 = new L2();

        L2 l2d = new L2(10.5);
        
        L3 l3 = new L3();
    
        L3 l3Arr = new L3(new int[]{1, 2, 3});
        
        L4 l4 = new L4(20.5);
        
        L4 l4s = new L4("Hello",100);
    }
}

