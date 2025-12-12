package methods;

public class ExtractDigitsAndPrint {
	public static void extractDigit(int num)
	{
		System.out.println("The extracted digits from "+num+" are: ");
		while(num !=0)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
		
	}	
	public static void main(String[] args)
	{
		extractDigit(1234);
		extractDigit(987);
	}

}
