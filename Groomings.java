import java.util.Scanner;

public class Groomings {

	public static void getGroomings() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Groomings ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Deodrants";
		int p1 = 200;
		String s2 = "Perfumes";
		int p2 = 1000;
		String s3 = "Beard Care & Grooming";
		int p3 = 300;
		String s4 = "Shaving & Aftershave";
		int p4 = 150;
		System.out.println(" 1.Deodrants\t Price:Rs.200 \n 2.Perfumes\t Price:Rs.1000"
				+ "\n 3.Beard Care & Grooming\t Price:Rs.300 \n 4.Shaving & Aftershave\t Price:Rs.150"
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
				GroomingsW.getGroomings();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			GroomingsW.getGroomings();
		}
	}

}
