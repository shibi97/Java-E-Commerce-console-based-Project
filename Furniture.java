import java.util.Scanner;

public class Furniture {

	public static void getFurniture() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Home & Furniture");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Kitchen, Cookware & Serveware \n 2.Tableware & Dinnerware"
				+ " \n 3.Bed Room Furniture \n 4.Living Room Furniture \n 5.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Kitchen.getKitchen();
					break;
				case 2:
					Tableware.getTableware();
					break;
				case 3:
					Bedroom.getBedroom();
					break;
				case 4:
					Livingroom.getLivingroom();
					break;
				case 5:
					Product.getProduct();
					break;
				
				default:
					System.out.println("Select a valid choice!!!");
					Furniture.getFurniture();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Furniture.getFurniture();
		}
		
	}

}
