import java.util.Scanner;

public class Clothing {

	public static void getClothing() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Clothings");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Shirts";
		int p1 = 700;
		String s2 = "T-Shirts";
		int p2 = 400;
		String s3 = "Pants";
		int p3 = 1000;
		String s4 = "Trousers";
		int p4 = 500;
		System.out.println(" 1.Shirts\t Price:Rs.700 \n 2.T-Shirts\t Price:Rs.400"
				+ "\n 3.Pants\t Price:Rs.1000 \n 4.Trousers\t Price:Rs.500"
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
					Men.getMen();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				Clothing.getClothing();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Clothing.getClothing();
		}
	}

}
