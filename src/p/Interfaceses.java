package p;

interface Banks
{
	float rateofintrest();
	
	
	
}

class Statebank implements Banks
{
	public float rateofintrest()
	{
		return 10.6f;
	}
}

class Andhrabank implements Banks
{
	public float rateofintrest()
	{
		return 2.9f;
	}
}
public class Interfaceses {

	public static void main(String[] args) {
		
		Banks b=new Statebank();
		System.out.println(b.rateofintrest());
		
		Banks b1=new Andhrabank();
		System.out.println(b1.rateofintrest());
		

	}

}
