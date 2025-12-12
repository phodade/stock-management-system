package polymorphism;

public class CardDriver
{
	public static void main(String[] args) {
		/*
		Card c=new Card();
		c.makePayment();
		
		DebitCard d=new DebitCard();
		d.makePayment();
		
		CreditCard cc=new CreditCard();
		cc.makePayment();
		*/
		
		
		Card c;
		c=new CreditCard();
		c.makePayment();
		
		c=new DebitCard();
		c.makePayment();
	}

}
