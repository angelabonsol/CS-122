
public class Books extends readingMaterial {

	public String author;
	public int year;
	public String genre;
	public int pages;

	public Books(String Title, String Author, int Year, String Genre, int Pages) {
		super(Title);
		author = Author;
		year = Year;
		genre = Genre;
		pages = Pages;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}

	public String toString() {
		String result = "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor() + "\nPublished Year: "
				+ this.getYear() + "\nGenre: " + this.getGenre() + "\nPages: " + this.getPages() + "\n";
		return result;
	}

}
