package Abstraction;

class testAbstraction
{
	public static void main(String[] args)
	{
		Bike b;
		b=new Honda();
		System.out.println("Honda's new bike is : "+b.model());
		b=new Hero();
		System.out.println("Honda's new bike is : "+b.model());
		b=new Bajaj();
		System.out.println("Honda's new bike is : "+b.model());
		
		testNormal t= new testNormal();
		t.model1();
	}

	
}
