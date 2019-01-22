
public class CurriculumTester {
	public static void main(String[]args) {
		MajorClass cp= new MajorClass("Computer Programming II", "CS 122", 4, "Teresa Brooks", " Java packages. Abstract classes and interfaces. Class inheritance and polymorphism.\nRecursion and linked lists. Object modeling and UMI. Event-driven programming and basic GUI design.\nMulti-threading and thread synchronization. Problem-solving through course projects.", 1, "CS 121 Min Grade C" );
		Elective art= new Elective("Painting I", "ART 145", 3, "Emmy Mikelson", "Contemporary painting materials and techniques are demonstrated using acrylic paints and mediums. \nThe course includes basic color theory and its application to both figurative and abstract painting. \nStudents work with a variety of subjects. ", "AOK 4" );
		Elective soc= new Elective("Introduction to Sociology","SOC 102", 3, "Caroline Debrovner", "An introduction to the basic concepts, methods, and application of the sociological perspective.\nThese concepts will be viewed in relation to contemporary institutions and trends. \n","AOK 2");
		English ee= new English("Critical Writing", "ENG 120", 4, "Mara Grayson", "This course will emphasize the development of argument and analysis as students work with a \nvariety of literary and non-fiction texts. Students will learn more advanced research skills, including methods of \ndocumentation, the use of library and Internet resources and the synthesis \nand integration of primary and secondary sources into their own essays. ");
		Math mm=new Math("Pre-Calculus", "MAT 130", 4, "Mohammed Sabha", "Precalculus course for students who require \nadditional mathematical background prior to taking MAT 131.", "logarithmic and exponential functions, trigonometric functions, trigonometric identities, \nsolving triangles, conic sections, solving equations.");
		
		System.out.println("Angela's Spring 2018 Courses");
		System.out.println(cp);
		System.out.println(art);
		System.out.println(soc);
		System.out.println(ee);
		System.out.println(mm);
		
	}

}
