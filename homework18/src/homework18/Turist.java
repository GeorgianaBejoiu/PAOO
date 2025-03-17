package homework18;

public class Turist extends Persoana {
	 private Hotel hotel;

	    public Turist(String nume, String email, Adresa adresa, Hotel hotel) {
	        super(nume, email, adresa);
	        this.hotel = hotel;
	        if (hotel != null) {
	            hotel.adaugaTurist(this);
	        }
	    }

	    public Hotel getHotel() {
	        return hotel;
	    }

	    public void mutaLaHotel(Hotel nouHotel) {
	        if (this.hotel != null) {
	            this.hotel.eliminaTurist(this);
	        }
	        this.hotel = nouHotel;
	        if (nouHotel != null) {
	            nouHotel.adaugaTurist(this);
	        }
	    }
}
