import java.util.Scanner;

public class ClothingK {

	public static void getClothing() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Clothings ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Ethnic Wear";
		int p1 = 700;
		String s2 = "Dresses & Skirts";
		int p2 = 400;
		String s3 = "Body Suits";
		int p3 = 1000;
		String s4 = "Polos & T-Shirts";
		int p4 = 1500;
		System.out.println(" 1.Ethnic Wear\t Price:Rs.700 \n 2.Dresses & Skirts\t Price:Rs.400"
				+ "\n 3.Body Suits\t Price:Rs.1000 \n 4.Polos & T-Shirts\t Price:Rs.1500"
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
				ClothingK.getClothing();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			ClothingK.getClothing();
		}
	}

}
