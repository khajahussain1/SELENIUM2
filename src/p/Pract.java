package p;



public class Pract 
{
	int rollnum;
	String name;
	float salary;
	
	Pract(int rollnum,	String name)
	{
		this.rollnum=rollnum;
		this.name=name;
		
	}
	
	Pract(int rollnum,	String name, float salary)
	{
		this(rollnum,name);
		this.salary=salary;
	}
	
	void desplay()
	{
		System.out.println(rollnum+" "+name+ " "+ salary);
	}
	public static void main(String[] args) 
	{
		Pract p=new Pract(101, "khaja");
		Pract p1=new Pract(102, "khaja", 24000f);
		p.desplay();
		p1.desplay();
	}

}
