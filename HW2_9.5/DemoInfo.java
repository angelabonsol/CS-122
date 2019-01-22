
public class DemoInfo {
	
	public static void main(String[]args) {
		
		Person pp = new Person( "Patricia", 7, "Nigerian" );
		Student ss= new Student("Gina", 16, "Mexican", "11th");
		CollegeStudent cs= new CollegeStudent("Richard", 20, "Chinese", "Junior-College", "Marketing", true ) ;
		Employed ee= new Employed("James", 24, "Filipino", "Software Engineer");
		Jobless jj= new Jobless("Emma", 42, "Russian", "$20,000 per year");
		
		System.out.println(pp);
		System.out.println(ss);
		System.out.println(cs);
		System.out.println(ee);
		System.out.println(jj);
	}

}
