import java.util.*;

public class Mobiles {

	public static void getMobiles() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Mobiles");
		System.out.println("----------------------------------------------------------------\n");
		
		String s1 = "Apple";
		int p1 = 98000;
		String s2 = "Samsung";
		int p2 = 56000;
		String s3 = "Google Pixel";
		int p3 = 72000;
		String s4 = "OnePlus";
		int p4 = 62000;
		System.out.println(" 1.Apple\t Price:Rs.98000 \n 2.Samsung\t Price:Rs.56000"
				+ "\n 3.Google Pixel\t Price:Rs.72000 \n 4.OnePlus\t Price:Rs.62000"
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
				Mobiles.getMobiles();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Mobiles.getMobiles();
		}
	}

}
