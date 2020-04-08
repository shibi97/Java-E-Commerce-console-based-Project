import java.util.*;

public class Kitchen {

	public static void getKitchen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Kitchen, Cookware & Serveware ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Pans";
		int p1 =500;
		String s2 = "Tawans";
		int p2 = 1000;
		String s3 = "Pressure Cookers";
		int p3 = 1500;
		String s4 = "Gas Stoves";
		int p4 = 2000;
		System.out.println(" 1.Pans\t\t Price:Rs.500 \n 2.Tawans\t\t Price:Rs.1000"
				+ "\n 3.Pressure Cookers\t\t Price:Rs.1500 \n 4.Gas Stoves\t Price:Rs.2000"
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
				Kitchen.getKitchen();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Kitchen.getKitchen();
		}
		
	}

}
