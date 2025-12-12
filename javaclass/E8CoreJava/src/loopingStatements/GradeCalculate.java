package loopingStatements;

public class GradeCalculate {
	public static void main(String[]args)
	{
		int mark=20;
		
		if(mark > 35 && mark < 45)
		{
			System.out.println("pass");
		}
		else if(mark >=90)
		{
			System.out.println("A Grade");
		}
		else if( mark >=80 && mark <90)
		{
			System.out.println("B Grade");
		}
		else if( mark >=70 && mark <80)
		{
			System.out.println("c Grade");
		}
		else if( mark >=60 && mark <70)
		{
			System.out.println("D Grade");
		}
		else if( mark >=50 && mark <60)
		{
			System.out.println("E Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
