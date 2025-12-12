package arrays;

import java.util.Arrays;

public class SortNumbersUsingSortMethod {
	public static void main(String[] args)
	{
		int [] arr= {7,23,78,90,-3,6,9,-2,-1,1};
		System.out.println("Before sorting :" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));
	}

}
