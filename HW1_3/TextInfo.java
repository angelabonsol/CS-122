public class TextInfo {

	public static void main(String[] args) {

		Books books = new Books("Hamlet", "William Shakespeare", 1609, "Tragedy", 204);
		Novels novels = new Novels("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel, Historical Fiction",
				"Jay Gatsby, Daisy Buchanan, Nick Carraway, etc.", 180);
		Textbooks textB = new Textbooks("Java Software Solutions", "John Lewis & William Loftus", 9,
				"Computer Programming");
		Magazines mags = new Magazines("Seventeen", "Michele Promaulayko", 73, 1);
		TechnicalJournals techJ = new TechnicalJournals("The Bell System Technical Journal",
				"A mathematical theory of communication", "C.E. Shannon", 27, 3);

		System.out.println("New York Public Library\n");
		System.out.println(books);
		System.out.println(novels);
		System.out.println(textB);
		System.out.println(mags);
		System.out.println(techJ);

	}
}