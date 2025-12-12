package arrays;

import java.util.Arrays;

public class ReverseWithoutUsingAnotherArray {
	public static void main(String[] args)
	{
		String [] cars= {"Harrier","BMW","Mercedes","Alto","Range Rover","Forturner"};
		
		int k=cars.length-1;
		
		for(int i=0;i<cars.length/2;i++)
		{
			String temp=cars[i];
			cars[i]=cars[k];
			cars[k]=temp;
			k--;
		}
		
		System.out.println("Reversed Array: "+ Arrays.toString(cars));
	}

}
