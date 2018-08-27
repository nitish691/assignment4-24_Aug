class college
{
	int a;
	double b;
	
	void Print()
	{
	System.out.println("Print functiom with null arguments");
	}
	
	void Print(int c)
	{
	a = c;
	System.out.println("Print functiom with one integer value = "+c);
	}
	
	void Print(double d)
	{
	b = d;
	System.out.println("Print functiom with one float value = "+b);
	}
}

class Q3
{
	public static void main(String x[])
	{
	college c = new college();
	c.Print();
	System.out.println();
	c.Print(50);
	System.out.println();
	c.Print(100.0f);
	}
}