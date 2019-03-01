package Polymorphism;

public class RunTimePolymorphism extends ChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc = new ChildClass();
		//This will call Child class method
		pc.parentMethod();
	}

}
