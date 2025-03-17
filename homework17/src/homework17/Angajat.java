package homework17;

public class Angajat extends Persoana  {

    private Companie companie;

    public Angajat(String nume, String prenume, String email, Adresa adresa, Companie companie) {
        super(nume, prenume, email, adresa);
        this.companie = companie;
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }

}
