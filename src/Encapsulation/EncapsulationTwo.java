package Encapsulation;

public class EncapsulationTwo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationOne enc = new EncapsulationOne();
		
		//Setting values
		enc.setAge(29);
		enc.setName("Vishal");
		
		//Getting values
		System.out.println("Age is: "+enc.getAge());
		System.out.println("Name is: "+enc.getName());
	}

}
