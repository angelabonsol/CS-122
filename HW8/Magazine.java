
// 13.2 - Angela Bonsol

public class Magazine implements Comparable<String>
{
    private String title;

    //-----------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public Magazine(String newTitle)
    {    
        title = newTitle;
    }

    @Override
	public int compareTo(String magazine) {
		return magazine.compareTo(title);
	}
    
    //-----------------------------------------------------------------
    //  Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return title;
    }

	
}