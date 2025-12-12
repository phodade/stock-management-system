package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionInArray {
	public static void main(String[] args)
	{
		int [] jersey= {7,18,45,33,10,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element which has to be insert in array:"+ Arrays.toString(jersey));
		int value=sc.nextInt();
		System.out.println("Enter the index where you wanna insert:"+value);
		
		int index=sc.nextInt();
		if(index >= 0 && index <= jersey.length)
		{
			int [] res = new int [jersey.length + 1];
			res[index]=value;
			
			for(int i=0;i<res.length;i++)
			{
				if(i < index)
					res[i]=jersey[i];
				else if(i > index)
					res[i]=jersey[i-1];	
			}
			System.out.println(Arrays.toString(res));
		}
		else
		{
			System.out.println("invalid index!!!,can't insert"+value);
		}
		}

}
