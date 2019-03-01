package Polymorphism;

public class CompileTimePolymorphism {

	void myMethod()
	{
		System.out.println("This is simple method without parameters");
	}
	
	void myMethod(int a)
	{
		int b = a;
		System.out.println("This is method has 1-parameter " +b);
	}
	
	void myMethod(int a, int b)
	{
		int p = a;
		int q = b;
		System.out.println("This is method has 2-parameter " +p+" "+q);
	}
	
	void myMethod(String str)
	{
		String s = str;
		System.out.println("This is method has string as parameter " +s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		ctp.myMethod();
		ctp.myMethod(10);
		ctp.myMethod(10, 20);
		ctp.myMethod("Vishal");
	}

}
