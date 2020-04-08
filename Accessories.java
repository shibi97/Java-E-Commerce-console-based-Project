import java.util.Scanner;

public class Accessories {

	public static void getAccessories() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Accessories ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Backpacks";
		int p1 = 1000;
		String s2 = "Wallets";
		int p2 = 500;
		String s3 = "Belts";
		int p3 = 300;
		String s4 = "Sunglasses";
		int p4 = 1000;
		System.out.println(" 1.Backpacks\t Price:Rs.1000 \n 2.Wallets\t Price:Rs.500"
				+ "\n 3.Belts\t Price:Rs.300 \n 4.Sunglasses\t Price:Rs.1000"
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
				Accessories.getAccessories();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Accessories.getAccessories();
		}
	}

}
