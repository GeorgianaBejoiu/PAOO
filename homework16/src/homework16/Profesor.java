package homework16;

public class Profesor extends Persoana {

	 private String specializare;

	    public Profesor(String nume, String prenume, String email, Adresa adresa, String specializare) {
	        super(nume, prenume, email, adresa);
	        this.specializare = specializare;
	    }

	    public void changeTeacherAddress(Adresa nouaAdresa) {
	        setAdresa(nouaAdresa);
	        System.out.println("Adresa profesorului a fost schimbată.");
	    }
}
