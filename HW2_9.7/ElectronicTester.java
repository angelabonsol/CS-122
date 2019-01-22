
public class ElectronicTester {
	
	public static void main (String[] args) {
		
		Computer cc= new Computer( "Computer", "Inspiron 14 3000", "Dell", "$249.99", "2041.17 grams", "Dual-Core" , "14.0 inch HD");
		Cellphone cp= new Cellphone( "Cellphone", "Iphone 6s", "Apple", "$449.00", "143 grams", "14 hours", "32 gb" );
		Pager pp= new Pager( "Pager", "Advisor II", "Motorola", "$70", "95 grams", "52 message slots" );
		DigitalCamera dc= new DigitalCamera("Digital Camera", "D5600", "Nikon", "$1,099.99", "467.2001 grams", 24.2 );
 
		
		System.out.println("Electronics");
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(pp);
		System.out.println(dc);
		
		
	}

}
