
public class Doctor extends Employee {
	
	public String type;
	
	public Doctor(String Name, int Years, String Position, String Type) {
		
		super(Name, Years, Position);	
		type=Type;
	}
	public String getType() {
		return type;
	}
	
	public String toString(){
		return super.toString() + "\nType: " + this.getType() + "\nJob Description: A person that maintains or restores another person's human health through the practice of medicine.\n" ;
		}


}