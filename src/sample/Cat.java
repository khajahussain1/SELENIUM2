package sample;

class A{
	float salary=40000;
	void eat()
	{
		System.out.println("Eating");
	}
}

class B extends A{
	void drink()
	{
		System.out.println("Drinking");
	}
}
class C extends B
{
	int bonus=20000;
}

public class Cat extends C{

	public static void main(String[] args) {
		Cat c=new Cat();
		System.out.println("salary is:"+c.salary+ " "+"bonus is:"+c.bonus);
		System.out.println("bonus is:"+c.bonus);
		c.eat();
		c.drink();

	}

}
