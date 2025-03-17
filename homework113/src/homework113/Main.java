package homework113;

import java.io.*;

public class Main {
	public static void main(String[] args) {
        String fileName = "input.txt"; // Numele fișierului de citire

        Fisier fileReader = new Fisier(fileName);
        int x = fileReader.readNumber(); // Citim numărul din fișier

        int result = Calculator.multiplyByTwo(x); // Calculăm 2*x

        System.out.println("Rezultatul este: " + result);
    }
}
