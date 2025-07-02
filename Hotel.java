public class Hotel {

	public static void main(String[] args) {
	}
		//Step 1: class constants with "Static"
		private static final double TAX_RATE =6.5, ROOM_RATE =79.95,TELEPHONE =5.75,MEAL_COST =12.95,TIP_RATE =0.075;
		
		//Step 2: class variables with "Static"
		private static double roomratetotal, telephonetotal,mealcharges, tiptotal,taxtotal, grosstransaction;
		
		//Step 3: instance variables
		private int noOfNights, noOfGuest;
		private double amountDue,meal,tax,subtotal,total,tip;
		private String roomNumber;
		
		//Step 4: constructors (Overloading)
		public Hotel(String room)
		{
			roomNumber = room;
			noOfGuest = 1;
			noOfNights = 1;		 
		}
		public Hotel(String room, int nights) {
		{ 
			roomNumber = room;
			noOfNights = nights;
		}
		}
		public Hotel(String room, int nights, int guest)
		{ 
			this(room, nights);
			noOfGuest = guest;
		}
		//Step 5: Instance Methods for instance variables and constants
		public double getAmountDue()
		{
			return amountDue;
		}
		public double getTaxDue()
		{
			return tax; 
		}
		public double getTotal() 
		{
			return total;
		}
		public double getSubtotal()
		{ 
			return subtotal;
		}
		public double Subtotal()
		{ 
			return subtotal;
		}
		public double getTip()
		{ 
			return tip;
		}
		public double getMeal()
		{ 
			return meal;
		}
		public String getRoomNumber()
		{ 
			return roomNumber;
		}
		public double getRoomRate()
		{
			return ROOM_RATE;
		}
		public int getNumberOfNights()
		{ 
			return noOfNights;
		}
		public int getNumberofGuest()
		{
			return noOfGuest;
		}
		public double getPhoneCharges()
		{
			return TELEPHONE;
		}
		public double getTaxRate()
		{
			return TAX_RATE;
		}
		
		//Step 6: Class Methods with the word "Static"
		public static double getRoomRateTotal()
		{ 
			return roomratetotal;
		}
		public static double getTelephoneTotal()
		{
			return telephonetotal;
		}
		public static double getMealCharges()
		{
			return mealcharges;
		}
		public static double getTipTotal()
		{
			return tiptotal; 
		}
		public static double getTaxTotal()
		{
			return taxtotal;
		}
		public static double getGrossTransaction()
		{
			return grosstransaction;
		}
		
		//Step 7: Mutator Method to calculate constants and variables
		public void addNight(int nights)
		{
			noOfNights = noOfNights + nights;
		}
		public void addGuest(int guest)
		{
			noOfGuest = noOfGuest + guest;	
		}
		public void calculate()
		{ 
			amountDue = ROOM_RATE * noOfNights * noOfGuest;
			tax = amountDue * TAX_RATE/100;
			subtotal = amountDue + tax;
			meal = MEAL_COST * noOfNights * noOfGuest;
			tip = TIP_RATE * (subtotal + meal + TELEPHONE);
			total= (subtotal + meal + TELEPHONE + tip);
			roomratetotal = roomratetotal + (amountDue);
			telephonetotal = TELEPHONE +telephonetotal;
			mealcharges = mealcharges + meal;
			tiptotal = tip + tiptotal;
			taxtotal = tax + taxtotal;
			grosstransaction = total + grosstransaction;
		}
	
}
