import java.util.Scanner;

public class HelloUser {
	public String userName;
	
	public String askName(){		
		Scanner user_input = new Scanner(System.in);
		userName = user_input.next();
		return userName;
	}
	public void greetUser(){		
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		System.out.print("Hello ");
		System.out.println(userName);
	}

}



//System.out.println(reader.nextLine()); // Scans the next token of the input
