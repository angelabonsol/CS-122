
public class HospitalEmployee {
	protected String name; 
	protected int num;
	
	public HospitalEmployee(String n, int p){
		name=n;
		num=p;
	}
	
	protected String getName() {
		return name;
	}
	protected int getNum() {
		return num;
	}
	
	public String toString() {
		String result=  this.getName() + "   " + this.getNum();
		return result;
	}
	
	public void work()
	   {
	      System.out.println (name + " works for the hospital.");
	   }


}
