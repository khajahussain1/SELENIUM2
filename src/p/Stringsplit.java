package p;

public class Stringsplit {

	public static void main(String[] args) {

		String str= "khajahussain";
		String s[]=str.split("");
		System.out.println(s.length);
//		for(String a:s)
//		{
//			System.out.println(a);
//		}
		for(int i=s.length-1; i>=0; i--)
		{
			System.out.print(s[i]+" ");
		}
	}

}
