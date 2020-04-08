import java.util.Scanner;

public class Books {

	public static void getBooks() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t Books ");
		System.out.println("----------------------------------------------------------------\n");
		System.out.println(" 1.Academics \n 2.Literature & Fiction \n 3.Young Readers "
				+ "\n 4.Business \n 5.Home Page");
		System.out.print("Select your choice: ");
		try {
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Academics.getAcademics();
					break;
				case 2:
					Fictions.getFictions();
					break;
				case 3:
					Young.getYoung();
					break;
				case 4:
					Product.getProduct();
					break;
				default:
					System.out.println("Select a valid choice!!!");
					Books.getBooks();
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice!!!");
			Books.getBooks();
		}
		
	}

}
