package homework110;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> forme = new ArrayList<>();
        forme.add(new Cerc(3));
        forme.add(new Cerc(5));

        // Calcularea ariei fiecărui cerc
        for (Shape s : forme) {
            System.out.println("Aria: " + s.getArea());
        }
    }
}
