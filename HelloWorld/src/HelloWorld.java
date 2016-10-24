/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloUser user1 = new HelloUser();
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		user1.userName = user1.askName();
		System.out.print("Hello ");
		System.out.println(user1.userName);
	}

}
