import java.text.SimpleDateFormat;
import java.util.*;

public class Cart {

	private static ArrayList item = new ArrayList();
	
	public static void addCart(String s, int p) {
		// TODO Auto-generated method stub
		int quantity = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity: ");
		quantity = sc.nextInt();
		System.out.print("Add "+quantity+" items to the cart(Y/N): ");
		char choice = sc.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			System.out.println("Items added to the cart successfully!!!");
		} else if (choice == 'N' || choice == 'n') {
			Product.getProduct();
		} else {
			System.out.print("Enter the valid input: ");
			viewCart();
		}
		item.add(s);
		item.add(quantity);
		item.add(p);
		Product.getProduct();
	}
	
	public static void viewCart() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\t\t\t\tCart");
		System.out.println("----------------------------------------------------------------");
		System.out.println(" 1.View Cart \n 2.Remove Cart");
		System.out.print("Select your choice: ");
		try {
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("----------------------------------------------------------------");
					System.out.println("\t\t\t\tCart");
					System.out.println("----------------------------------------------------------------");
					int j= 1;
					if(item.size()>0) {
						for(int i=0;i<item.size();i++) {
							int a=(int) item.get(i+2);
							int b=(int) item.get(i+1);
							System.out.println("Product-id: "+j);
							System.out.println("Item: "+item.get(i));
							System.out.println("Price: "+item.get(i+2)+".Rs");
							System.out.println("Quantity: "+item.get(i+1));
							System.out.println("Total: "+a*b+".Rs");
							System.out.println("__________________________________________\n");
							i++;
							i++;
							j++;
						}
						System.out.print("\n Buy Now(Y/N): ");
						char choice = sc.next().charAt(0);
						if (choice == 'Y' || choice == 'y') {
							billing();
						} else if (choice == 'N' || choice == 'n') {
							Product.getProduct();
						} else {
							System.out.println("\n\n");
							System.out.println("Enter the valid input");
							System.out.println();
							viewCart();
						}
					}else {
						System.out.println("Your Cart is Empty");
						System.out.println("Please add items to the cart");
						Product.getProduct();
					}
					break;
				case 2:
					System.out.println("----------------------------------------------------------------");
					System.out.println("\t\t\t\tCart");
					System.out.println("----------------------------------------------------------------");
					int j1= 1;
					if(item.size()>0) {
						for(int i=0;i<item.size();i++) {
							int a=(int) item.get(i+2);
							int b=(int) item.get(i+1);
							System.out.println("Product-id: "+j1);
							System.out.println("Item: "+item.get(i));
							System.out.println("Price:Rs. "+item.get(i+2));
							System.out.println("Quantity: "+item.get(i+1));
							System.out.println("Total:Rs. "+a*b);
							i++;
							i++;
							j1++;
						}
					}
					int c = item.size()/3;
					System.out.println("Enter the product-id to be reomoved: ");
					try {
						int ch1 = sc.nextInt(); 
						if(ch1<=c&&ch1>0) {
							ch1 = (ch1 - 1)*3;
							item.remove(ch1);
							item.remove(ch1);
							item.remove(ch1);
							System.out.println("Item Removed Successfully!!!");
							Product.getProduct();
						}
						else {
							System.out.println("Select a valid input");
							viewCart();
						}
					}catch (Exception e) {
						System.out.println("Select a valid input");
						viewCart();
					}
					
					
			}
		}catch (Exception e) {
			System.out.println("Select a valid input");
			viewCart();
		}
		
	}

	private static void billing() {
		Scanner sc = new Scanner(System.in);
		
		if(item.size()>0) {
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat(
					"E dd.MM.YYYY '                                             ' hh:mm:ss a zzz");
			System.out.println(ft.format(date));
			System.out.println("...............................................");
			System.out.println("\t\t\tBilling");
			System.out.println("...............................................\n");
			System.out.print("Enter your Name: ");
			String name = sc.nextLine();
			System.out.print("Mobile Number: ");
			long ph =Long.parseLong(sc.nextLine());
			System.out.print("Enter your address: ");
			String ad = sc.nextLine();
			int total=0;
			int qty=0;
			System.out.println("*****************ORDER DETAILS********************");
			for(int i=0;i<item.size();i++) {
				int a=(int) item.get(i+2);
				int b=(int) item.get(i+1);
				int j1=1;
				System.out.println("Product-id: "+j1);
				System.out.println("Item: "+item.get(i));
				System.out.println("Price: Rs."+item.get(i+2));
				System.out.println("Quantity: "+item.get(i+1));
				System.out.println("Total: Rs."+a*b);
				total+=(a*b);
				qty+=b;
				i++;
				i++;
				j1++;
			}
			float grand=((total*(5/100f))+(total*(5/100f))+total);
			System.out.println("CGST @5%: Rs."+(total*(5/100f)));
			System.out.println("SGST @5%: Rs."+(total*(5/100f)));
			System.out.println("Grand Total@10%: Rs."+grand);
			System.out.println("Name: "+name);
			System.out.println("Mobile Number: "+ph);
			System.out.println("Delivery Address: "+ad);
			payement( grand );
		}
	}

	private static void payement(float grand) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Amount to be Paid: "+grand);
		System.out.println("...............................................");
		System.out.println("\t\t\tPayement");
		System.out.println("...............................................\n");
		System.out.println(" 1.ATM \n 2.COD ");
		System.out.print("Select your choice: ");
		try {
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("-----------ATM------------");
					System.out.print("Enter your card number: ");
					long num =sc.nextLong();
					System.out.print("Enter the cvv: ");
					int cv = sc.nextInt();
					System.out.print("Enter the amount: ");
					float amt = sc.nextFloat();
					if(amt!=grand) {
						System.out.println("Invalid Amount");
						payement(grand);
					}
					else {
						System.out.println("Paid Successfully!!!");
						System.out.println("Your Package is ready to process");
						Product.getProduct();
					}
					break;
				case 2:
					System.out.println("-----------COD------------");
					System.out.println("Amount to be paid ");
					System.out.println("Your Package is ready to process");
					break;
				default:
					System.out.println("Select a valid choice");
					payement(grand);
					break;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Select a valid choice");
			payement(grand);
		}
		
	}

	

}
