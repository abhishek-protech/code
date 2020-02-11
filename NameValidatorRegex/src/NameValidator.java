import java.util.Scanner;

public class NameValidator {
	
	public static boolean isAlpha(String s) {
		return s!=null && s.matches("^[a-zA-Z]*$");
	}

	public static void main(String[] args) {
		
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = input.nextLine();
		System.out.println(isAlpha(name));
		

	}

}
