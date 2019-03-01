import java.util.Arrays;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, temp1 = 0, temp2 = 1;

		// Fibbonacci
		for (int i = 1; i < 10; i++) {
			sum = temp1 + temp2;
			System.out.print(" " + sum);
			temp1 = temp2;
			temp2 = sum;
		}
		System.out.println(" ");

		// reverse string
		String RevStr = "";
		String str = "Vishal is in Yardi";
		// String ar[]=(String)str;
		for (int i = str.length() - 1; i >= 0; i--) {
			RevStr = RevStr + str.charAt(i);
		}
		System.out.println(" " + RevStr);

		// Reverse words only

		String original = "Reverse these words only";
		String reverse[] = original.split(" ");

		for (int i = 0; i < reverse.length; i++) {
			String word = reverse[i];

			String revWord = " ";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);

			}
			System.out.print(revWord);
		}
		System.out.println(" ");

		// Pallindrome
		System.out.println("Enter Number or string to check whether it is Pallindrome or not :  ");
		Scanner scanInput = new Scanner(System.in);
		String strInput = scanInput.nextLine();
		System.out.println("string entered is "+strInput);
		String palliStr="";
		for(int i= strInput.length()-1;i>=0;i--)
		{
			palliStr= palliStr+strInput.charAt(i);
		}
		System.out.println("String: "+palliStr);
		if(palliStr.equals(strInput))
		{
			System.out.println("String entered is Pallindrome string: "+palliStr);
		}
		else
		{
			System.out.println("String entered is not a Pallindrome string: "+palliStr);
		}
		System.out.println("this is been viewd in GITHUB");
	}
}
