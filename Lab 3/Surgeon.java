
public class Surgeon extends Doctor{
	public boolean operating;
	
	public Surgeon (String n, int p, String t, boolean o) {
		super(n, p, t);
		operating=o;
	}
	public boolean getOperating() {
		return operating;
	}

	public String toString () {
		return super.toString() + "Operating:"  + this.getOperating();
	}
	
	@Override
		public void work()
		   {
				if (operating) {
					super.work();
					System.out.println ( this.getName() + " is operating now.");
				}
				else {
					super.work();
					System.out.println ( this.getName() + " is not operating now.");
				}
		   }
	
}
