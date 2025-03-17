package homework19;

import java.util.ArrayList;
import java.util.List;


public interface Shape {
	 double getArea();
}
class Cerc implements Shape {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double getArea() {
        return Math.PI * raza * raza;
    }
}


