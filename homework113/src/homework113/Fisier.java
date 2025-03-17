package homework113;

import java.io.*;

public class Fisier {
	 private String fileName;

	    public Fisier(String fileName) {
	        this.fileName = fileName;
	    }

	    public int readNumber() {
	        int x = 1; // Valoare implicită în caz de eroare
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line = reader.readLine();
	            x = Integer.parseInt(line.trim()); // Convertim linia citită în număr
	        } catch (FileNotFoundException e) {
	            System.out.println(" Eroare: Fișierul nu a fost găsit. Se folosește x = 1.");
	        } catch (IOException e) {
	            System.out.println(" Eroare la citirea fișierului. Se folosește x = 1.");
	        } catch (NumberFormatException e) {
	            System.out.println(" Eroare: Conținut invalid. Se folosește x = 1.");
	        }
	        return x;
	    }
}
