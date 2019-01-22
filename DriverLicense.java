
public class DriverLicense extends IDCard {
	
	public int year;
	
	public DriverLicense(String n, int idNumber, int y) 
	{
		super(n, idNumber);
		year= y;
	
	}
	
	public int getYear()
	{
		return year;
	}
	public String toString() 
	{
		String result= "DriverLicense [Name=" + this.getName() + "][ID Number=" + this.getIdNumber() + "][ExpirationYear=" + this.getYear() + "]";
		return result;
	}
}
