import java.util.*;

public class Electronics {

	public static void getElectronics() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Electronics");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Mobiles \n 2.Laptops \n 3.Televisions "
				+ "\n 4.WashingMachine \n 5.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Mobiles.getMobiles();
					break;
				case 2:
					Laptops.getLaptops();
					break;
				case 3:
					Televisions.getTelevisions();
					break;
				case 4:
					WashingMachine.getWashingMachine();
					break;
				case 5:
					Product.getProduct();
					break;
				default:
					System.out.println("Select a valid choice!!!");
					Electronics.getElectronics();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Electronics.getElectronics();
		}
	}
	
}
