
public class Doctor extends HospitalEmployee {
	private String specialty;
	public Doctor (String n, int p, String t) {
		super(n, p);
		specialty=t;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public String toString () {
		return super.toString () + "   " + this.getSpecialty();
	}
	
	@Override
	public void work()
	   {
		super.work();
	    System.out.println (this.getName() +" is a(n) " + this.getSpecialty() + " doctor. ");
	   }
	
}
