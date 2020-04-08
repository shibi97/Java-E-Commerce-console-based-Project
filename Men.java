import java.util.Scanner;

public class Men {

	public static void getMen() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Men's");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Clothing \n 2.Footwares \n 3.Groomings "
				+ "\n 4.Accessories \n 5.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Clothing.getClothing();
					break;
				case 2:
					Footwares.getFootwares();
					break;
				case 3:
					Groomings.getGroomings();
					break;
				case 4:
					Accessories.getAccessories();
					break;
				case 5:
					Product.getProduct();
					break;
			
				default:
					System.out.println("Select a valid choice!!!");
					Men.getMen();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Men.getMen();
		}
	}

}
