
public class Magazines extends readingMaterial {
	public String editor;
	public int volume;
	public int issue;

	public Magazines(String Title, String Editor, int Volume, int Issue) {
		super(Title);
		editor = Editor;
		volume = Volume;
		issue = Issue;
	}

	public String getEditor() {
		return editor;
	}

	public int getVolume() {
		return volume;
	}

	public int getIssue() {
		return issue;
	}

	public String toString() {
		String result = "Title: " + this.getTitle() + "\nEditor: " + this.getEditor() + "\nVolume: " + this.getVolume()
				+ "\nIssue: " + this.getIssue() + "\n";
		return result;

	}

}
