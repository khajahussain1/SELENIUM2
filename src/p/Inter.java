package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inter {

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		
		list.add("khaja");
		list.add("hussain");
		list.add("poola");
		list.add("rahim");
		
Collections.reverse(list);
System.out.println(list);
		
	}

}

