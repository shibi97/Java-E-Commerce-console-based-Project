import java.util.Scanner;

public class ClothingW {

	public static void getClothing() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Clothings ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Jeans";
		int p1 = 1700;
		String s2 = "T-Shirts";
		int p2 = 400;
		String s3 = "Shorts";
		int p3 = 500;
		String s4 = "Saree";
		int p4 = 2500;
		System.out.println(" 1.Jeans\t Price:Rs.1700 \n 2.T-Shirts\t Price:Rs.400"
				+ "\n 3.Shorts\t Price:Rs.500 \n 4.Saree\t Price:Rs.2500"
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
					Women.getWomen();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				ClothingW.getClothing();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			ClothingW.getClothing();
		}
	}

}
