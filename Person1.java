public abstract class Person1 {
	
	public static String name; 
	public static int year;
	protected abstract int getAvgAge();

	public Person1(String Name, int Year) {
		name= Name;
		year=Year;
	}

	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		
		String result= "Name=" + this.getName() + ", birthYear=" + this.getYear();
		return result;	
	}

}
