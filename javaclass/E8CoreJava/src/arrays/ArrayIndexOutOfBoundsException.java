package arrays;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args)
	{
		String [] movies= {"OG","Dhoom","Dhoom2","Dhoom3"};
		
		System.out.println(movies[0]);
		System.out.println(movies[3]);
		System.out.println(movies[2]);
		System.out.println(movies[4]);//AIOBE
		
		movies[2]="Pushpa";	
		
		movies[-1]="salaar";
		
	}

}
