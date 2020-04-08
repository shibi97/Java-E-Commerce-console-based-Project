import java.util.Scanner;

public class Fictions {

	public static void getFictions() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Literature & Fiction ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Romance";
		int p1 = 300;
		String s2 = "Science Fiction";
		int p2 = 400;
		String s3 = "Novels";
		int p3 = 450;
		String s4 = "Historical Fiction";
		int p4 = 700;
		System.out.println(" 1.Romance\t Price:Rs.300 \n 2.Science Fiction\t Price:Rs.400"
				+ "\n 3.Novels\t Price:Rs.450 \n 4.Historical Fictions\t Price:Rs.700"
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
					Books.getBooks();
					break;
				case 6:
					Product.getProduct();
					break;
			default:
				System.out.println("Select a valid choice!!!");
				Fictions.getFictions();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Fictions.getFictions();
		}
	}

}
