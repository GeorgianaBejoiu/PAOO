package homework18;

public class Persoana {
	    protected String nume;
	    protected String email;
	    protected Adresa adresa;

	    public Persoana(String nume, String email, Adresa adresa) {
	        this.nume = nume;
	        this.email = email;
	        this.adresa = adresa;
	    }

	    public String getNume() {
	        return nume;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public Adresa getAdresa() {
	        return adresa;
	    }

	    public void setAdresa(Adresa adresa) {
	        this.adresa = adresa;
	    }
}
