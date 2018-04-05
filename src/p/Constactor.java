package p;

public class Constactor {
	
	private int id;
	String name;
	int age;
	
	public Constactor(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Constactor(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {

		Constactor c=new Constactor(112, "kjdf");
		Constactor c1=new Constactor(112, "kjdf", 25);
		c.display();
		c1.display();
	}

}
