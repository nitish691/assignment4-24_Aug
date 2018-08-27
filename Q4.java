abstract class Vehicle
{
	abstract void start();
	
	public void stop()
	{
	System.out.println("Stop function in Vehicle class");
	}

}

class twowheeler extends Vehicle
{
	public void start()
	{
	System.out.println("Start function in twowheeler class");
	}
	
	public void stop()
	{
	System.out.println("Stop function in twowheeler class");
	}
	
}

class fourwheeler extends Vehicle
{
	public void start()
	{
	System.out.println("Start function in fourwheeler class");
	}
	
	public void stop()
	{
	System.out.println("Stop function in fourwheeler class");
	}
	
}

class Q4
{
	public static void main(String x[])
	{
	twowheeler t1 = new twowheeler();
	fourwheeler f1 = new fourwheeler();
	
	t1.start();
	t1.stop();
	
	System.out.println(); 
	
	f1.start();
	f1.stop();
	}
}