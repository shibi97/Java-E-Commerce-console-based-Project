import java.util.*;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t\tFlipkart");
		System.out.println("--------------------------------------------------------------");
		System.out.println("\n \tLogin");
		System.out.println("....................\n");
		System.out.print("User_Name: ");
		String usr_name = sc.nextLine();
		while(!usr_name.matches("Shibin")) {
			System.out.println("Username doesn't exist!!!\n");
			System.out.print("User_Name: ");
			usr_name = sc.nextLine();
		}
		System.out.print("Password: ");
		String pass = sc.nextLine();
		while(!pass.matches("pass123")) {
			System.out.println("Inavalid Password!!!\n");
			System.out.print("Password: ");
			pass = sc.nextLine();
		}
		Product.getProduct();
	}
}
