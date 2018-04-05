package p;

class Student
{
	private String name;
	
	String getname()
	{
		return name;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setname("Raja");
		System.out.println(s.getname());
		
		
	}}
