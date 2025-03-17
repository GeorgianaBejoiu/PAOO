package homework18;

public class Adresa {
	private String strada;
    private Oras oras;

    public Adresa(String strada, Oras oras) {
        this.strada = strada;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public Oras getOras() {
        return oras;
    }

    public void setOras(Oras oras) {
        this.oras = oras;
    }
}
