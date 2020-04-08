import java.util.Scanner;

public class Academics {

	public static void getAcademics() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Academics ");
		System.out.println("----------------------------------------------------------------\n");
		String s1 = "Text Books";
		int p1 = 500;
		String s2 = "Sample Papers";
		int p2 = 300;
		String s3 = "Dictionary";
		int p3 = 600;
		String s4 = "Exams";
		int p4 = 700;
		System.out.println(" 1.Text Books\t Price:Rs.500 \n 2.Sample Papers\t Price:Rs.300"
				+ "\n 3.Dictionary\t Price:Rs.600 \n 4.Exams\t Price:Rs.700"
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
				Academics.getAcademics();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Academics.getAcademics();
		}
	}

}
