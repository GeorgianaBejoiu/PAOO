package homework111;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
	 String getColor();
	 double getPerimeter();
}
//Clasa abstractă Shape2D și Shape3D
abstract class Shape2D implements Shape {
 public abstract double getArea();
}

abstract class Shape3D extends Shape2D {
 public abstract double getVolume();
}

//Implementarea clasei SegmentDeDreapta
class SegmentDeDreapta implements Shape {
 private double lungime;
 private String culoare;

 public SegmentDeDreapta(double lungime, String culoare) {
     this.lungime = lungime;
     this.culoare = culoare;
 }

 @Override
 public double getPerimeter() {
     return lungime;
 }

 @Override
 public String getColor() {
     return culoare;
 }
}

//Implementarea claselor pentru forme geometrice
class Patrat extends Shape2D {
 private double latura;
 private String culoare;

 public Patrat(double latura, String culoare) {
     this.latura = latura;
     this.culoare = culoare;
 }

 @Override
 public double getPerimeter() {
     return 4 * latura;
 }

 @Override
 public double getArea() {
     return latura * latura;
 }

 @Override
 public String getColor() {
     return culoare;
 }
}

class Cub extends Shape3D {
 private double latura;
 private String culoare;

 public Cub(double latura, String culoare) {
     this.latura = latura;
     this.culoare = culoare;
 }

 @Override
 public double getPerimeter() {
     return 12 * latura;
 }

 @Override
 public double getArea() {
     return 6 * latura * latura;
 }

 @Override
 public double getVolume() {
     return latura * latura * latura;
 }

 @Override
 public String getColor() {
     return culoare;
 }
}
