package homework17;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        Adresa adresaCompanie = new Adresa("Str. IT Park", "Bucuresti", "010101");
        Companie companie1 = new Companie("TechCorp", adresaCompanie);
        Companie companie2 = new Companie("SoftSolutions", new Adresa("Str. StartUp", "Cluj", "020202"));

        Adresa adresaAngajat1 = new Adresa("Str. Mihai Viteazu", "Bucuresti", "050505");
        Angajat angajat1 = new Angajat("Ionescu", "Andrei", "andrei.ionescu@techcorp.com", adresaAngajat1, companie1);
        
        Adresa adresaAngajat2 = new Adresa("Str. Libertatii", "Cluj", "060606");
        Angajat angajat2 = new Angajat("Popescu", "Maria", "maria.popescu@softsolutions.com", adresaAngajat2, companie2);

        companie1.addEmployee(angajat1);
        companie2.addEmployee(angajat2);

        // Mutăm angajatul într-o altă companie
        companie1.removeEmployee(angajat1);
        companie2.addEmployee(angajat1);

        // Afișăm toți angajații unei companii
        companie2.listEmployees();

        // Găsim compania după nume și listăm angajații
        List<Companie> companii = new ArrayList<>();
        companii.add(companie1);
        companii.add(companie2);

        Companie gasita = Companie.findCompanyByName("SoftSolutions", companii);
        if (gasita != null) {
            gasita.listEmployees();
        } else {
            System.out.println("Compania nu a fost găsită.");
        }
    }
}
