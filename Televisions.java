import java.util.Scanner;

public class Televisions {

	public static void getTelevisions() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Televisions");
		System.out.println("----------------------------------------------------------------\n");
		
		String s1 = "LG";
		int p1 = 128000;
		String s2 = "Samsung";
		int p2 = 76000;
		String s3 = "Panasonic";
		int p3 = 72000;
		String s4 = "MI-TV";
		int p4 = 42000;
		System.out.println(" 1.LG\t\t Price:Rs.128000 \n 2.Samsung\t Price:Rs.76000"
				+ "\n 3.Panasonic\t Price:Rs.72000 \n 4.MI-TV\t Price:Rs.42000"
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
				Televisions.getTelevisions();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Televisions.getTelevisions();
		}
	}

}
