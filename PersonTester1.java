public class PersonTester1
{
   public static void main(String[] args)
   {
      Person p = new Person("Perry", 1959 ); 
      Student1 s = new Student1("Sylvia", 1979, "Computer Science");
      Instructor1 e = new Instructor1("Edgar", 1969, 65000);
      System.out.println(p); //toString method of Person class will be called automatically 
      System.out.println(s);
      System.out.println(e);
   }
}
