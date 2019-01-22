public class CardTester {

	public static void main(String[] args) {
		Card c = new Card("Edsger");
		CallingCard cc = new CallingCard("Bjarne", 41566416425L, 2234);
		IDCard id = new IDCard("Edgar", 987654321);
		DriverLicense dl = new DriverLicense("Perri", 123456789, 2019);
		System.out.println(c); //toString method of Person class will be called automatically 
		System.out.println("Expected: Card[name=Edsger]");
		System.out.println(cc);
		System.out.println("Expected: CallingCard[name=Bjarne][number=4156646425][pin=2234]");
		System.out.println(id);
		System.out.println("Expected: IDCard[name=Edgar][ID number= 987654321]");
		System.out.println(dl);
		System.out.println("Expected: DriverLicense[name=Perri][ID number= 123456789][ExpirationYear=2019]");
	}

}