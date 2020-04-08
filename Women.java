import java.util.Scanner;

public class Women {

	public static void getWomen() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Women's");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Clothing \n 2.Footwares \n 3.Groomings "
				+ "\n 4.Accessories \n 5.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					ClothingW.getClothing();
					break;
				case 2:
					FootwaresW.getFootwares();
					break;
				case 3:
					GroomingsW.getGroomings();
					break;
				case 4:
					AccessoriesW.getAccessories();
					break;
				case 5:
					Product.getProduct();
					break;
				
				default:
					System.out.println("Select a valid choice!!!");
					Women.getWomen();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Women.getWomen();
		}
	}

}
