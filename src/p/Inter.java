package p;

import java.util.HashMap;
import java.util.Map;

public class Inter {
	
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "khaja");
		map.put(102, "Hussain");
		map.put(103, "Hussain");
		map.put(101, "Khaja");
		
		for (Map.Entry m:map.entrySet()) 
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
