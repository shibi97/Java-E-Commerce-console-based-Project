import java.util.Scanner;

public class Young {

	public static void getYoung() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Young Readers ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "6-9 Years";
		int p1 = 300;
		String s2 = "9-12 Years";
		int p2 = 400;
		String s3 = "13-16 Years";
		int p3 = 450;
		String s4 = "Young Adults";
		int p4 = 700;
		System.out.println(" 1.6-9 Years\t Price:Rs.300 \n 2.9-12 Years\t Price:Rs.400"
				+ "\n 3.13-16 Years\t Price:Rs.450 \n 4.13-16 Years\t Price:Rs.700"
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
				Young.getYoung();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Young.getYoung();
		}
	}

}
