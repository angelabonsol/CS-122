
public class Novels extends Books {
	public String characters;

	public Novels(String Title, String Author, int Year, String Genre, String Chars, int Pages) {
		super(Title, Author, Year, Genre, Pages);
		characters = Chars;

	}

	public String getChars() {
		return characters;

	}

	public String toString() {
		String result = "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPublished Year: "
				+ this.getYear() + "\nGenre: " + this.getGenre() + "\nMain Characters: " + this.getChars() + "\nPages: "
				+ this.getPages() + "\n";
		return result;
	}

}
