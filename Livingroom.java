import java.util.Scanner;

public class Livingroom {

	public static void getLivingroom() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Living Room Furniture ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Sofa";
		int p1 =45000;
		String s2 = "Sofa Beds";
		int p2 = 60000;
		String s3 = "TV Units";
		int p3 = 22500;
		String s4 = "Chairs and Tables";
		int p4 = 35000;
		System.out.println(" 1.Sofa\t\t\t Price:Rs.45000 \n 2.Sofa Beds\t\t Price:Rs.60000"
				+ "\n 3.TV Units\t\t Price:Rs.22500 \n 4.Chairs and Tables\t Price:Rs.35000"
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
				Livingroom.getLivingroom();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Livingroom.getLivingroom();
		}
	}

}
