import java.util.Scanner;

public class Kids {

	public static void getKids() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Kids");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Clothing \n 2.Footwares \n 3.Toys "
				+ "\n 4.Baby Care \n 5.Home Page ");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					ClothingK.getClothing();
					break;
				case 2:
					FootwaresK.getFootwares();
					break;
				case 3:
					Toys.getKids();
					break;
				case 4:
					BabyCare.getBabyCare();
					break;
				case 5:
					Product.getProduct();
					break;
				
				default:
					System.out.println("Select a valid choice!!!");
					Kids.getKids();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Kids.getKids();
		}
	}

}
