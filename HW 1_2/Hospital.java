
public class Hospital {

	public static void main(String[] args) {

		Doctor doc = new Doctor("Belen Borja", 20, "Doctor", "Peditrician");
		Nurse rn = new Nurse("Arlene Alcasid", 6, "Nurse");
		Administrator ad = new Administrator("Antoinette Baylosis", 5, "Administrator");
		Surgeon sur = new Surgeon("Anna Mata", 10, "Doctor", "Surgeon");
		Receptionist rec = new Receptionist("Maria Bonsol", 3, "Receptionist");
		Janitor jan = new Janitor("Nicole Lopez", 2, "Janitor");

		System.out.println("Richmond University Medical Center Employees:\n");
		System.out.println(doc);
		System.out.println(rn);
		System.out.println(ad);
		System.out.println(sur);
		System.out.println(rec);
		System.out.println(jan);
	}
}
