abstract class Animal
{	
	public String breed,color;
	abstract public void speak();
}

class Cat extends Animal
{
	public void getbreed(String x)
	{
	breed = x;	
	}
	
	public void getcolor(String y)
	{
	color = y;	
	}
	
	
	public void speak()
	{
	System.out.println(breed);
	System.out.println(color);	
	System.out.println("Meow");
	}
}

class Dog extends Animal
{
	public void getbreed(String a)
	{
	breed = a;	
	}
	
	public void getcolor(String b)
	{
	color = b;	
	}
	
	public void speak()
	{
	System.out.println(breed);
	System.out.println(color);		
	System.out.println("Bark");
	}
}
class Q2
{
	public static void main(String x[])
	{
	Cat c1 = new Cat();
	Dog d1 = new Dog();
	
	c1.getbreed("Persian");
	c1.getcolor("Black");
	
	d1.getbreed("Pomerian");
	d1.getcolor("White");
	
	c1.speak();
	System.out.println();
	d1.speak();
	}
}
