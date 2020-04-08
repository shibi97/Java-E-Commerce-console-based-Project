import java.util.Scanner;

public class BabyCare {

	public static void getBabyCare() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t BabyCare ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Dipares";
		int p1 = 100;
		String s2 = "Wipes";
		int p2 = 250;
		String s3 = "Bab yFood";
		int p3 = 300;
		String s4 = "Baby Grooming";
		int p4 = 300;
		System.out.println(" 1.Dipares\t Price:Rs.100 \n 2.Wipes\t Price:Rs.250"
				+ "\n 3.Baby Food\t Price:Rs.300 \n 4.Baby Grooming\t Price:Rs.300"
				+ "\n 5.Previous Page \n 6.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					Cart.addCart(s1,p1);
					break;
				case 2:
					Cart.addCart(s2,p2);
					break;
				case 3:
					Cart.addCart(s3,p3);
					break;
				case 4:
					Cart.addCart(s4,p4);
					break;
				case 5:
					Kids.getKids();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				BabyCare.getBabyCare();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			BabyCare.getBabyCare();
		}
	}

}
