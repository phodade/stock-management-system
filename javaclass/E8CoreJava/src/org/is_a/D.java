package org.is_a;

public class D extends C
{
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(D.x);
		System.out.println(D.y);
		
		D obj=new D();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
