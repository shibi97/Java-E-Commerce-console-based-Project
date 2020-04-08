import java.util.Scanner;

public class FootwaresW {

	public static void getFootwares() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Footwares ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Sports Shoes";
		int p1 = 1500;
		String s2 = "Casual Shoes";
		int p2 = 1000;
		String s3 = "Flats";
		int p3 = 700;
		String s4 = "Heels";
		int p4 = 1250;
		System.out.println(" 1.Sports Shoes\t Price:Rs.1500 \n 2.Casual Shoes\t Price:Rs.1000"
				+ "\n 3.Flats\t Price:Rs.700 \n 4.Heels\t Price:Rs.1250"
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
				FootwaresW.getFootwares();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			FootwaresW.getFootwares();
		}
	}

}
