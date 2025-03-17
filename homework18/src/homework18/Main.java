package homework18;

public class Main {
	 public static void main(String[] args) {
	        // Creăm un oraș
	        Oras bucuresti = new Oras("București");

	        // Creăm hoteluri
	        Hotel hotel1 = new Hotel("Hotel Lux", new Adresa("Bd. Unirii 10", bucuresti));
	        Hotel hotel2 = new Hotel("Hotel Royal", new Adresa("Str. Victoriei 5", bucuresti));

	        // Adăugăm hoteluri în oraș
	        bucuresti.adaugaHotel(hotel1);
	        bucuresti.adaugaHotel(hotel2);

	        // Creăm turiști
	        Turist turist1 = new Turist("Ion Popescu", "ion@email.com", new Adresa("Str. Florilor 3", bucuresti), hotel1);
	        Turist turist2 = new Turist("Maria Ionescu", "maria@email.com", new Adresa("Str. Mihai Bravu 7", bucuresti), hotel2);

	        // Listăm hotelurile din oraș
	        System.out.println("Hoteluri în " + bucuresti.getNume() + ":");
	        for (Hotel hotel : bucuresti.getHoteluri()) {
	            System.out.println("- " + hotel.getNume());
	        }

	        // Listăm turiștii din oraș
	        System.out.println("\nTuriști cazați în București:");
	        for (Turist turist : bucuresti.getTuristi()) {
	            System.out.println("- " + turist.getNume() + " (Hotel: " + turist.getHotel().getNume() + ")");
	        }

	        // Mutăm un turist la un alt hotel
	        System.out.println("\nMaria se mută la Hotel Lux...");
	        turist2.mutaLaHotel(hotel1);

	        // Verificăm dacă Maria este cazată în București
	        System.out.println("\nMaria este cazată în București? " + bucuresti.getTuristi().contains(turist2));
	    }
}
