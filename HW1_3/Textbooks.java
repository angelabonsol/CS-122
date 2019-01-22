
public class Textbooks extends Books {

	public int edition;
	public String sub;

	public Textbooks(String Title, String Author, int Edition, String Subject) {
		super(Title, Author, Edition, Subject, Edition);
		edition = Edition;
		sub = Subject;
	}

	public int getEdition() {
		return edition;
	}

	public String getSubject() {
		return sub;
	}

	public String toString() {
		String result = "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nEdition: "
				+ this.getEdition() + "\nSubject: " + this.getSubject() + "\n";
		;
		return result;
	}

}
 