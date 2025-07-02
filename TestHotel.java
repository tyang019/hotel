import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
public class TestHotel {

	public static void main(String[] args) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();	
		//Step 1: Create Sales Object
		Hotel customer1 = new Hotel("10-M",2,2);
		customer1.calculate();
		displayReceipt(customer1, nf);		
		Hotel customer2 = new Hotel("12-B", 1, 1);
		Hotel customer3 = new Hotel("12-C", 2, 1); 	
		customer2.addNight(1);
		customer2.calculate();
		displayReceipt(customer2, nf); 
		customer3.addGuest(1); 
		customer3.calculate();
		displayReceipt(customer3, nf); 	
		displayReciept(nf);		
	}
		//Step 2: Class Method
	public static void displayReceipt(Hotel customer, NumberFormat nf)
	{	
		//Step 3: Create heading and date for each receipt
		System.out.println("\tThe ABC Cheap Lodging, Inc");
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("\tDate: \t" + df.format(d)); 	
		//Step 4: Display expenses line by line
		System.out.println("Room #    \t\t" + customer.getRoomNumber());
		System.out.println("Room Rate  \t\t" + nf.format(customer.getRoomRate()));
		System.out.println("Length of Stay \t\t" + customer.getNumberOfNights()+ " night(s)");
		System.out.println("No. of guests \t\t" + customer.getNumberofGuest());
		System.out.println("Room cost \t\t" + nf.format(customer.getAmountDue()));
		System.out.println("Tax6.5% \t\t" + nf.format(customer.getTaxDue()));
		System.out.println("    Subtotal\t\t" + nf.format(customer.getSubtotal()));
		System.out.println("Telephone\t\t" + nf.format(customer.getPhoneCharges()));
		System.out.println("Meal charges\t\t" + nf.format(customer.getMeal()));
		System.out.println("Tip\t\t\t" + nf.format(customer.getTip()));		
		//Step 5: Display total amount
		System.out.println("\nTOTAL AMOUNT DUE\t........." + nf.format(customer.getTotal())); 	
		//Step 6: Display thank you message
		System.out.println("\nThanks for staying at The ABC Cheap Lodging, Inc");
		System.out.println("\tPlease come again !!!");
		System.out.println("\n");
	} 	
		//Step 7: Display summary total
	public static void displayReciept(NumberFormat nf) {
		System.out.println("\tOfficial Use Only\n");
		System.out.println("\tToday's Summary");
		System.out.println("\tRoom\t...." + nf.format(Hotel.getRoomRateTotal()));
		System.out.println("\ttelephone....." + nf.format(Hotel.getTelephoneTotal()));
		System.out.println("\tMeal\t...." + nf.format(Hotel.getMealCharges()));
		System.out.println("\tTips\t....." + nf.format(Hotel.getTipTotal()));
		System.out.println("\tTax \t....." + nf.format(Hotel.getTaxTotal()));
		System.out.println("\t--------------------------");
		System.out.println("\tGross transaction .." + nf.format(Hotel.getGrossTransaction()));
		System.out.println("Process completed.");
		}		
}
