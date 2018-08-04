package p;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Person
{
	int id;
	String name;
	String profision;
	
	public Person(int id, String name, String profision)
	{
		this.id=id;
		this.name=name;
		this.profision=profision;
	}
}
public class Mapclass {

	public static void main(String[] args) 
	{
		HashMap<Integer,Person> map=new HashMap<Integer,Person>();
		Person p1=new Person(101, "khaja", "software Engineer");
		Person p2=new Person(102, "Hussain", "Engineer");
		map.put(1, p1);
		map.put(2, p2);
		
		for (Map.Entry<Integer, Person> m: map.entrySet()) 
		{
			int key=m.getKey();
			Person p=m.getValue();
			System.out.println(key+" Details:-");
			System.out.println("      "+p.id+" "+p.name+" "+p.profision);
			
		}
		

	}

}
