package Inheritance;

public class MyClass implements MyInterfaceTwo
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterfaceTwo reference = new MyClass();
		reference.myMethodTwo();
	}

	@Override
	public void myMethodOne() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of method One");
	}

	@Override
	public void myMethodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of method Two");
	}

}
