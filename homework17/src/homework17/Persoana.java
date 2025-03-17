package homework17;

public abstract class Persoana {
	protected String nume;
    protected String prenume;
    protected String email;
    protected Adresa adresa;
    
    public Persoana(String nume, String prenume, String email, Adresa adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.adresa = adresa;
    }
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

}
