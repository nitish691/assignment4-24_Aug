class first
{
	static int a;
	static
	{
	System.out.println("Static outside main");
	a = 20;
	}
	
	public int display()
	{
	return a;
	}
}

class Q1
{
	static 
	{
	System.out.println("Static inside main");
	}
	
	public static void main(String x[])
	{
		System.out.println("Main Function");
		
		first obj = new first();
		System.out.println(obj.display());
	}
}