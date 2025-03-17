package homework112;

public class Exceptii {

    // Varianta 1: Tratarea excepției în interiorul metodei
    public static int imparteTratata(int x) {
        int rezultat;
        try {
            rezultat = 10 / x;
        } catch (ArithmeticException e) {
            System.out.println("Împărțire prin 0. Returnăm 0.");
            rezultat = 0;
        }
        return rezultat;
    }

    // Varianta 2: Aruncarea excepției către apelant
    public static int imparteAruncata(int x) throws ArithmeticException {
        return 10 / x;
    }

    public static void main(String[] args) {
        // Testare varianta 1 (excepția este gestionată intern)
        System.out.println("Varianta 1: " + imparteTratata(0));
        System.out.println("Varianta 1: " + imparteTratata(2));

        // Testare varianta 2 (excepția trebuie tratată în main)
        try {
            System.out.println("Varianta 2: " + imparteAruncata(0));
        } catch (ArithmeticException e) {
            System.out.println("Excepție capturată în main: Împărțire la 0.");
        }

        System.out.println("Varianta 2: " + imparteAruncata(2));
    }
}
