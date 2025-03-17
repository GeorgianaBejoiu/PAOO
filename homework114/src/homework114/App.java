package homework114;

import java.util.InputMismatchException;
import java.util.Scanner;3

public class App {
	 // Metodă pentru citirea unui număr întreg, repetând până la input corect
    int readNumber() {
        Scanner in = new Scanner(System.in);
        int numar = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Introduceți un număr întreg: ");
                numar = in.nextInt();
                valid = true; // Ieșim din buclă dacă inputul este valid
            } catch (InputMismatchException ex) {
                System.err.println("Eroare: Vă rugăm să introduceți un număr întreg!");
                in.next(); // Consumăm inputul invalid pentru a evita bucla infinită
            }
        }
        return numar;
    }

    public static void main(String[] args) {
        App app1 = new App();
        int nr, sum = 0;

        // Citirea primului număr
        nr = app1.readNumber();
        sum += nr;

        // Citirea celui de-al doilea număr
        nr = app1.readNumber();
        sum += nr;

        // Afișarea sumei
        System.out.println("Suma: " + sum);
    }
}
