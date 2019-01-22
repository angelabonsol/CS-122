
public class Nurse extends HospitalEmployee{
	private int numOfPatients; 
	public Nurse (String n, int p, int patients) {
		super (n, p);
		numOfPatients=patients;
	}
	public int getNumOfPatients() {
		return numOfPatients;
	}
	public String toString() {
		return super.toString() + "  has " + this.getNumOfPatients() + " patients.";
	}
	
	@Override
	public void work()
	   {
		super.work();
	    System.out.println (this.getName() + " is a nurse with " + this.getNumOfPatients() + " patients.");
	   }

}
