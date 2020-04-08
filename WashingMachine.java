import java.util.Scanner;

public class WashingMachine {

	public static void getWashingMachine() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Washing Machines");
		System.out.println("----------------------------------------------------------------\n");
		
		String s1 = "LG";
		int p1 = 38000;
		String s2 = "Samsung";
		int p2 = 46000;
		String s3 = "Whirlpool";
		int p3 = 22000;
		String s4 = "Bosch";
		int p4 = 42000;
		System.out.println(" 1.LG\t\t Price:Rs.38000 \n 2.Samsung\t Price:Rs.46000"
				+ "\n 3.Whirlpool\t Price:Rs.22000 \n 4.Bosch\t Price:Rs.42000"
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
				WashingMachine.getWashingMachine();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			WashingMachine.getWashingMachine();
		}
	}

}
