package p;

class A1{
	int id;
	String name;
	String color="White";
	
	A1(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Welcome to parant class constractor");
	}
	void message()
	{
		//System.out.println("Welcome to Chennai");
	}
}

class D1 extends A1{
	
	float salary;
	D1(int id, String name, float salary)
	{
		super(id, name);
		this.salary=salary;
		
		//System.out.println("Welcome to sub calss constractor");
		
	}
	@Override
	void message() {
		
		System.out.println(id+" "+name+" "+salary);
		//System.out.println("Welcome to Hyderabad");
	}
	
	void display()
	{
		super.message();
	}
	String color="black";
	
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		D1 d=new D1(111, "khaja", 2365f);
		d.printcolor();
		d.display();
		d.message();
		

	}

}
