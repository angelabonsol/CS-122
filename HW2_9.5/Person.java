
public class Person {
	
	public String personName; 
	private int personAge;
	private String personNationality;
	
	public Person (String name, int age, String nationality ) {
		personName=name;
		personAge=age; 
		personNationality=nationality;
	}
	
	public String getName(){
		return personName; 
	}
	
	private int getAge() {
		return personAge; 
	}
	
	private String getNationality() {
		return personNationality;
	}
	
	public String toString() {
		String result = "\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nNationality: " + this.getNationality();
		return result;
	}

}
