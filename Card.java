public class Card
{
   protected String name;


   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }
   
   public String toString() 
   {
	   String result= "Card [" + this.getName() +"]";
	   return result;
   }
   
}