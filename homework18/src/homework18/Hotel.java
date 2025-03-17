package homework18;

import java.util.ArrayList;
import java.util.List;


public class Hotel  {
	private String nume;
    private Adresa adresa;
    private List<Turist> turisti;

    public Hotel(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.turisti = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public List<Turist> getTuristi() {
        return turisti;
    }

    public void adaugaTurist(Turist turist) {
        turisti.add(turist);
    }

    public void eliminaTurist(Turist turist) {
        turisti.remove(turist);
    }
}
