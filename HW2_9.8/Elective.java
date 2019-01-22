
public class Elective extends Courses {
	private String contribute;
	
	public Elective (String title, String number, int credits, String instructor, String des, String con) {
		super(title, number, credits, instructor, des);
		contribute=con;
	}
	
	private String getCon() {
		return contribute;
	}
	
	public String toString() {
		return super.toString() + "\nContribute: " + this.getCon();
	}

}
