package StaticAndNonStatic;

public class ParameterizesConsUsingThisKeyword {
	
	String name;
	int rollno;
	
	
	ParameterizesConsUsingThisKeyword(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	 public static void main(String[] args) {
		 ParameterizesConsUsingThisKeyword s1 = new ParameterizesConsUsingThisKeyword("pratiksha", 22);
	        System.out.println(s1.name);
	        System.out.println(s1.rollno);
	        
	        ParameterizesConsUsingThisKeyword s2 = new ParameterizesConsUsingThisKeyword("jai", 21);
	        System.out.println(s2.name);
	        System.out.println(s2.rollno);
	        
	        ParameterizesConsUsingThisKeyword s3 = new ParameterizesConsUsingThisKeyword("purva", 12);
	        System.out.println(s3.name);
	        System.out.println(s3.rollno);
	    }

}
