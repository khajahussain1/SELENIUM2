package s;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;


public class A2 {

	@Test
	public void f(){
		
		ArrayList<Object> l1=new ArrayList<Object>();
		l1.add(true);
		l1.add(10);
		l1.add("khaja@123");
		
		Iterator<Object> it=l1.iterator();
		
		//ArrayList al=new ArrayList<>();
		
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }
		
		
		}

	}


