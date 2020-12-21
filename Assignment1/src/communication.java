import java.util.*;
public class communication {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String name,TV;
		int age,price,item;
		char gender;
		double discount, total;

		
		System.out.print("Enter the name of the customer: ");
		name = in.next();
		
		System.out.print("Enter the age of the customer: ");
		age = in.nextInt();
		
		System.out.print("Enter gender of the customer: ");
		gender = in.next().charAt(0);
		
		System.out.print("Enter the product/services: ");
		String product = in.next();
		
		if(product.equals("QLED")) {
			System.out.println("The price is RM987");
		}         
		if(product.equals("OLED")) {
			System.out.println("The price is RM1,600");
		}
			else
				if(product.equals("LCD")) {
					System.out.println("The price is RM2,260");
				}
				else
					if(product.equals("DLP")) {
						System.out.println("The price is RM1,940");
					}
					else
						if(product.equals("Plasma")) {
							System.out.println("The price is RM850");
						}
						else
							if(product.equals("Direct_TV")) {
								System.out.println("The price is RM1,200");
							}
								else 
									System.out.println("None");
		System.out.println();
		
	    //how many item that customer purchase
		System.out.print("Enter the item purchase: ");
		item = in.nextInt();
		
		System.out.println();
		
		//calculate the total price
		System.out.print("Enter the price given is RM ");
		price = in.nextInt();
		
		System.out.println();
		
		total = price * item;
		System.out.println("The total price: RM" +total);
		
		//discount
		System.out.println();
		if(total>1000) {
			discount = total * 0.1;
		}
		else
			discount = total * 0.2;
		
		System.out.println("Discount received: RM" +discount);
		System.out.println("Price to be paid on the product after discout: RM" +(total-discount));
		}
		
		

}

		
		

	


