package StaticAndNonStatic;

public class K {
    {
        System.out.println("IIB");
    }

    public void test1() {
        System.out.println("test1() method");
    }

    public boolean test2() {
        System.out.println("test2() method");
        return false;
    }

    public static void main(String[] args) {
        K obj1 = new K();   
        obj1.test1();
        System.out.println(obj1.test2());
    }
}
