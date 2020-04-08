import java.util.*;

public class Product {
	public static void getProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t\tProducts ");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Electronics \n 2.Home & Furniture \n 3.Men \n 4.Women "
				+ "\n 5.Kids \n 6.Books \n 7.Cart \n 8.Exit");
		System.out.print("Select your choice: ");
		try {
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					Electronics.getElectronics();
					break;
				case 2:
					Furniture.getFurniture();
					break;
				case 3:
					Men.getMen();
					break;
				case 4:
					Women.getWomen();
					break;
				case 5:
					Kids.getKids();
					break;
				case 6:
					Books.getBooks();
					break;
				case 7:
					Cart.viewCart();
					break;
				default:
					System.out.println("Select a valid choice!!!");
					Product.getProduct();
					break;
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Product.getProduct();
		}
	}
}
