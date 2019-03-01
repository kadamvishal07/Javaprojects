package Encapsulation;

public class EncapsulationOne {

	//Declaring private Variables, therefore these variables can only be accessed by Public methods
	private int age;
	private String name;
	
	// Getter method to access Private variable
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	//Setter methods to access Private Variable
	public int setAge(int inputAge)
	{
		return age=inputAge;
	}
	
	public String setName(String inputName)
	{
		return name=inputName;
	}
}
