package Inheritance;

public class Class3 extends Class2{

	public void methodClass1()
	{
		System.out.println("Method of Class3");
	}
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class3();
		c1.methodClass1();
	}

}
