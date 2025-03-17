package homework19;

public class Robot {
	 // Metode stub (fără implementare, doar definiție)
    public void start() {
        System.out.println("Robotul a pornit.");
    }

    public void stop() {
        System.out.println("Robotul s-a oprit.");
    }

    public void move() {
        System.out.println("Robotul se mișcă.");
    }

    public static void main(String[] args) {
        // Instanțiere și apelarea metodelor
        Robot r = new Robot();
        r.start();
        r.move();
        r.stop();
    }
}
