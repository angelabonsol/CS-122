
public class Person {
	
	public String name; 
	public int year;
	public Person (String Name, int Year ) {
		name= Name; 
		year= Year;
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
