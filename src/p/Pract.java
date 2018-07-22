package p;

class Dog1
{
	protected int a=10;
	
	public void s()
	{
		System.out.println("s is executed");
	}
}
class Dog2 extends Dog1
{
	public void t()
	{
		System.out.println(a);
	}
}

public class Pract 
{
	public static void main(String[] args) 
	{
		Dog2 d=new Dog2();
		d.t();
		d.s();
		
	}

}
