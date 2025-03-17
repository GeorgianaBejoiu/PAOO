package homework16;

public class Student extends Persoana {

	private String numarMatricol;

    public Student(String nume, String prenume, String email, Adresa adresa, String numarMatricol) {
        super(nume, prenume, email, adresa);
        this.numarMatricol = numarMatricol;
    }

    public void changeStudentAddress(Adresa nouaAdresa) {
        setAdresa(nouaAdresa);
        System.out.println("Adresa studentului a fost schimbată.");
    }
}
