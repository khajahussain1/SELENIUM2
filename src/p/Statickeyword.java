package p;

public class Statickeyword {

	int rollno;
	String name;
	static String collegename="National College"; 
	
	public Statickeyword(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+collegename);
	}
	
	public static void main(String[] args) {
		Statickeyword sk=new Statickeyword(23, "Khaja");
		sk.display();
		

	}

}
