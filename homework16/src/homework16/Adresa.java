package homework16;

public class Adresa {

	private String strada;
    private int numar;
    private String oras;
    private String codPostal;

    public Adresa(String strada, int numar, String oras, String codPostal) {
        this.strada = strada;
        this.numar = numar;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public void setStrada(String strada) { this.strada = strada; }
    public void setNumar(int numar) { this.numar = numar; }
    public void setOras(String oras) { this.oras = oras; }
    public void setCodPostal(String codPostal) { this.codPostal = codPostal; }

    @Override
    public String toString() {
        return strada + " " + numar + ", " + oras + " - " + codPostal;
    }
}
