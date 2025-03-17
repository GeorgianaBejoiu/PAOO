package homework17;
import java.util.ArrayList;
import java.util.List;

public class Companie {
	private String nume;
    private Adresa adresa;
    private List<Angajat> angajati;

    public Companie(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.angajati = new ArrayList<>();
    }

    public void addEmployee(Angajat angajat) {
        angajati.add(angajat);
        angajat.setCompanie(this);
        System.out.println("Angajatul " + angajat.getNume() + " a fost adăugat la compania " + nume + ".");
    }

    public void removeEmployee(Angajat angajat) {
        if (angajati.remove(angajat)) {
            angajat.setCompanie(null);
            System.out.println("Angajatul " + angajat.getNume() + " a fost eliminat din compania " + nume + ".");
        } else {
            System.out.println("Angajatul nu a fost găsit.");
        }
    }

    public List<Angajat> getEmployeesAtAddress(Adresa adresa) {
        List<Angajat> result = new ArrayList<>();
        for (Angajat a : angajati) {
            if (a.getAdresa().equals(adresa)) {
                result.add(a);
            }
        }
        return result;
    }

    public static Companie findCompanyByName(String numeCautat, List<Companie> companii) {
        for (Companie companie : companii) {
            if (companie.nume.equalsIgnoreCase(numeCautat)) {
                return companie;
            }
        }
        return null;
    }

    public void listEmployees() {
        System.out.println("Angajați la compania " + nume + ":");
        for (Angajat a : angajati) {
            System.out.println(a.getNume() + " " + a.getPrenume());
        }
    }
}
