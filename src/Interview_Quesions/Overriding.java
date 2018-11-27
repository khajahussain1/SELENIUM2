package Interview_Quesions;

class Bank{
	int getRateOfIntrast()
	{
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfIntrast()
	{
		return 7;
	} 
}
class ICICI extends Bank{
	int getRateOfIntrast()
	{
		return 8;
	} 
}

class AXIS extends Bank{
	int getRateOfIntrast()
	{
		return 9;
	} 
}
public class Overriding {

	
	public static void main(String[] args) {
		
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		
		System.out.println("SBI rate of intrest:"+s.getRateOfIntrast());
		System.out.println("ICIC rate of intrest:"+i.getRateOfIntrast());
		System.out.println("AXIS rate of intrest:"+a.getRateOfIntrast());
	}

}
