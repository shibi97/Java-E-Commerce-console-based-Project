import java.util.Scanner;

public class Bedroom {

	public static void getBedroom() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Bed Room Furniture ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Beds";
		int p1 =35000;
		String s2 = "Matteress";
		int p2 = 20000;
		String s3 = "Wadrobes";
		int p3 = 12500;
		String s4 = "Almirahs";
		int p4 = 15000;
		System.out.println(" 1.Beds\t\tPrice:Rs.35000 \n 2.Matteress\t Price:Rs.20000"
				+ "\n 3.Wadrobes\t Price:Rs.12500 \n 4.Almirahs\t Price:Rs.15000"
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
					Furniture.getFurniture();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				Bedroom.getBedroom();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Bedroom.getBedroom();
		}
	}

}
