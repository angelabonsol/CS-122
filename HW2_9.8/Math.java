
public class Math extends Courses{
	protected String mathFocus;
	
	public Math (String title, String number, int credits, String instructor, String des, String cover) {
		super(title, number, credits, instructor, des);
		mathFocus=cover;
	}
	
	protected String getCover() {
		return mathFocus;
	}
	
	public String toString() {
		return super.toString() + "\nTopics Covered: " + this.getCover();
		
	}

}
