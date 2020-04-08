import java.util.Scanner;

public class Laptops {

	public static void getLaptops() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Laptops");
		System.out.println("----------------------------------------------------------------\n");
		
		String s1 = "Hp";
		int p1 = 58000;
		String s2 = "Dell";
		int p2 = 36000;
		String s3 = "Mac";
		int p3 = 72000;
		String s4 = "Lenovo";
		int p4 = 62000;
		System.out.println(" 1.Hp\t Price:Rs.58000 \n 2.Dell\t Price:Rs.36000"
				+ "\n 3.Mac\t Price:Rs.72000 \n 4.Lenovo\t Price:Rs.62000"
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
					Electronics.getElectronics();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				Laptops.getLaptops();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Laptops.getLaptops();
		}
	}

}
