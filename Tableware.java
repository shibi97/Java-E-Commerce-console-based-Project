import java.util.Scanner;

public class Tableware {

	public static void getTableware() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Tableware & Dinnerware ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Coffe Mug";
		int p1 =120;
		String s2 = "Dinner Sets";
		int p2 = 1000;
		String s3 = "Barware";
		int p3 = 700;
		String s4 = "Containers";
		int p4 = 400;
		System.out.println(" 1.Coffe Mug\t Price:Rs.120 \n 2.Dinner Sets\t Price:Rs.1000"
				+ "\n 3.Barware\t Price:Rs.700 \n 4.Containers\t Price:Rs.400"
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
				Tableware.getTableware();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Tableware.getTableware();
		}
		
	}

}
