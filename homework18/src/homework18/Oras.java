package homework18;

import java.util.ArrayList;
import java.util.List;

public class Oras {
	private String nume;
    private List<Hotel> hoteluri;

    public Oras(String nume) {
        this.nume = nume;
        this.hoteluri = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void adaugaHotel(Hotel hotel) {
        hoteluri.add(hotel);
    }

    public List<Hotel> getHoteluri() {
        return hoteluri;
    }

    public List<Turist> getTuristi() {
        List<Turist> turisti = new ArrayList<>();
        for (Hotel hotel : hoteluri) {
            turisti.addAll(hotel.getTuristi());
        }
        return turisti;
    }
}
