package Interview_Quesions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.testng.annotations.Test;

public class Pract {
	@Test
	public void count_duplicate_charectors_in_string() {
		//String s = "mmababctamantlslmag";
		String s="khajahussain";
		int distinct = 0;

		for (int i = 0; i < s.length(); i++) 
		{

			for (int j = 0; j < s.length(); j++) 
			
			{

				if (s.charAt(i) == s.charAt(j)) 
				{
					distinct++;

				}
			}
			System.out.println(s.charAt(i) + "-->" + distinct);
			String d= Character.toString(s.charAt(i)).trim();
			//String d = String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(d, "");
			distinct = 0;

		}
	}

	// @Test
	public void array() 
	 {
	        ArrayList<String> al = new ArrayList<String>();
	 
	        al.add("khaja");  
	        al.add("hussain"); 
	        al.add("poola");
	        al.add(null);
	        al.add("hussain");  
	        al.add("Facebook");  
	        al.add("poola");  
	        al.add("khaja");
	        al.add("Facebook");  
	        al.add("Google");
	        al.add(null);
	 
	 
	        // create HashSet to find duplicate element 
	        HashSet<String> hsUnique = new HashSet<String>(al);
	 
	        System.out.println("Duplicates\tElement Name");
	        System.out.println("==========\t=================");
	 
	        // Iterate using enhanced for-loop
	        for (String strElement : hsUnique) {
	            System.out.println(Collections.frequency(al, strElement) + "\t\t" + strElement);
	        }
	    }
	 
	//@Test
		public void count_duplicate_charectors() {
		
	
			String[] s = {"khaja", "hussain", "khaja", "khaja"};
			int distinct = 0;

			for (int i = 0; i < s.length; i++) {

				for (int j = i+1; j < s.length; j++) {

					if (s[i]==s[j] && i != j) {
						distinct++;

					}
				}
				System.out.println(s[i] + "-->" + distinct);
				distinct = 0;

			}

	 }
}



