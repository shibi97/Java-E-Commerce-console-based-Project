import java.util.Scanner;

public class Toys {

	public static void getKids() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Toys ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Remote Control Toys";
		int p1 = 500;
		String s2 = "Educational Toys";
		int p2 = 300;
		String s3 = "Outdoor Toys";
		int p3 = 200;
		String s4 = "Action Figures";
		int p4 = 700;
		System.out.println(" 1.Remote Control Toys\t Price:Rs.500 \n 2.Educational Toys\t Price:Rs.300"
				+ "\n 3.Outdoor Toys\t Price:Rs.200 \n 4.Action Figures\t Price:Rs.700"
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
				Toys.getKids();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Toys.getKids();
		}
	}

}
