package s;

import Interview_Quesions.Address;

public class Emp {
	
	String name;
	int id;
	Address address;
	public Emp(String name, int id, Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	void display()
	{
		System.out.println("Emp id number:-"+" "+id+", "+"Emp name:-"+" "+name);
		System.out.println("Employee Address:-");
		System.out.println(address.city+", "+address.state+", "+address.country);
	}

	public static void main(String[] args) {
		Address a1=new Address("chennai", "Tamil Nadu", "INDIA");
		Address a2=new Address("Hyderabad", "Andhra Pradesh", "INDIA");
		Emp e1=new Emp("KHAJA",111,a1);
		Emp e2=new Emp("VALI", 222, a2);
		e1.display();
		e2.display();

	}

}
