package Interview_Quesions;

abstract class Bank1{
	
	int a=10, b=20;
	int c;
	Bank1()
	{
		System.out.println("Bank is working daily");
	}
	abstract int getrateofint();
	
	void get()
	{
		System.out.println("reta of intrested is very low");
		c=a+b;
		System.out.println(c);
	}
}

class SB extends Bank1
{
	int getrateofint()
	{
		return 7;
	}
}

class AXI extends Bank1
{
	int getrateofint()
	{
		return 9;
	}
}

public class Bankabstract {

	public static void main(String[] args) {
		
		Bank1 b;
		b=new SB();
		System.out.println("rate of intrest"+b.getrateofint() +" %");
		b=new AXI();
		System.out.println("rate of intrest"+b.getrateofint() +" %");
		

	}

}
