package homework111;

import java.util.ArrayList;
import java.util.List;


public class Main {
	 public static void main(String[] args) {
	        List<Shape> forme = new ArrayList<>();
	        forme.add(new Patrat(4, "Albastru"));
	        forme.add(new Cub(3, "Roșu"));

	        for (Shape s : forme) {
	            System.out.println("Culoare: " + s.getColor());
	            System.out.println("Perimetru: " + s.getPerimeter());

	            if (s instanceof Shape2D) {
	                System.out.println("Arie: " + ((Shape2D) s).getArea());
	            }
	            if (s instanceof Shape3D) {
	                System.out.println("Volum: " + ((Shape3D) s).getVolume());
	            }
	            System.out.println();
	        }
	    }
}
