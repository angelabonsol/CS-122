
public class IDCard extends Card {
	
	private int idNumber; 
	
	public IDCard(String n, int idNum)
	{
		 super(n);
		 idNumber =idNum;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	 
	public String toString() 
	   {
		   String result= "ID Card [name=" + this.getName() + "][ID Number=" + this.getIdNumber() + "]";
		   return result;
		  
	   }
	
}
