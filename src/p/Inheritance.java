package p;

class Animal{
	void eat()
	{
		System.out.println("eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		BabyDog bd=new BabyDog();
		bd.bark();
		bd.eat();
		bd.weep();
		

	}

}
