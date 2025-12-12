package StaticAndNonStatic;

public class ParameterizesConstructorResolution {
    String name;
    int rollno;
    
    ParameterizesConstructorResolution(String name1, int rollno1) {
        name = name1;
        rollno = rollno1;
    }
    
    public static void main(String[] args) {
        ParameterizesConstructorResolution s1 = new ParameterizesConstructorResolution("pratiksha", 22);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        
        ParameterizesConstructorResolution s2 = new ParameterizesConstructorResolution("pratiksha", 22);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        
        ParameterizesConstructorResolution s3 = new ParameterizesConstructorResolution("pratiksha", 22);
        System.out.println(s3.name);
        System.out.println(s3.rollno);
    }
}
