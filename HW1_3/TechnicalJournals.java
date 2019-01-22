public class TechnicalJournals extends Magazines {
	public String heading;

	public TechnicalJournals(String Title, String Heading, String Editor, int Volume, int Issue) {
		super(Title, Editor, Volume, Issue);
		heading = Heading;
	}

	public String getHeading() {
		return heading;
	}

	public String toString() {
		String result = "Title: " + this.getTitle() + "\nHeading: " + this.getHeading() + "\nEditor: "
				+ this.getEditor() + "\nVolume: " + this.getVolume() + "\nIssue:" + this.getIssue() + "\n";
		;
		return result;

	}

}
