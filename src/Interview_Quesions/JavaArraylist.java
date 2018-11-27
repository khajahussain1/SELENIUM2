package Interview_Quesions;

import java.util.ArrayList;
import java.util.List;

class Books
{
	int id;
	String name,author,publisher;  
	int quantity;
	
	Books(int id, String name, String authour, String publisher, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=authour;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class JavaArraylist {

	public static void main(String[] args) {
		
		Books b1=new Books(12, "Khaja", "Ravi", "Hussain", 20);
		Books b2=new Books(14, "Vali", "Ravikumar", "Kamal", 40);
		
		ArrayList<Books> li=new ArrayList<Books>();
		li.add(b1);
		li.add(b2);
		for(Books b:li)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}

	}
}
