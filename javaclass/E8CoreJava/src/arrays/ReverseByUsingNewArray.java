package arrays;

import java.util.Arrays;

public class ReverseByUsingNewArray {
	public static void main(String[] args)
	{
		String[] movies= {"kgf","kantara","Ms Dhoni","salaar","marco"};
		
		String [] res= new String[movies.length];
		
		int k=0;
		
		for(int i=movies.length-1;i>=0;i--)
		{
			res[k]=movies[i];
			k++;
		}
		System.out.println("Reversed array: "+ Arrays.toString(res));
	}

}
