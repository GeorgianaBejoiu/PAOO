package homework110;

import java.util.ArrayList;
import java.util.List;

// Interfața Shape
interface Shape {
    double getArea();
}

// Clasa Cerc care implementează Shape
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



