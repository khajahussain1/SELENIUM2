package p;

interface khaja
{
	void ram();
}

interface hussain
{
	void ram();
}

interface poola extends khaja, hussain
{
	void sam();
}

public class Inter {
	
	public void ram()
	{
		System.out.println("ram");
	}
	
	public void sam()
	{
		System.out.println("sam");
	}

	public static void main(String[] args) 
	{
		Inter in=new Inter();
		in.ram();
		in.sam();

	}

}
