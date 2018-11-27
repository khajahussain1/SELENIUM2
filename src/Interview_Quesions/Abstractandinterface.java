package Interview_Quesions;

interface A
{
	void a();
	void b();
	void c();
	void d();
	
}

abstract class B implements A
{
	public void c()
	{
		System.out.println("c is a method");
	}
}
class M extends B
{
	public void a()
	{
		System.out.println("a is a method");
	}
	public void b()
	{
		System.out.println("b is a method");
	}
	public void d()
	{
		System.out.println("d is a method");
	}
}

public class Abstractandinterface {

	public static void main(String[] args) {
		
A m=new M();
m.a();
m.b();
m.c();
m.d();
	}

}
