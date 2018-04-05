package sample;

class Student{  
	 int id;  
	 String name;
	 int age;
	


void insertrecord(int r, String n)
{
	id=r;
	name=n;
}
void insertrecord(int r, String n, int a)
{
	id=r;
	name=n;
	age=a;
}

void math()
{
	System.out.println(id+" "+name+" "+age);
}
}
public class Objectintilization {

	public static void main(String[] args) {
		Student s1=new Student(),s2=new Student();
          s1.insertrecord(101, "khaja");
          s2.insertrecord(102, "hussain", 22);
		s1.math();
		s2.math();

	}

}
