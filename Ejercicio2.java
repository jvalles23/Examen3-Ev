package Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {
	public static void leerFichero(String fichero, String a, String b, String s, String n) {
		File file = new File(fichero);
		int contadorL = -1;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		try {
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				contadorL++;
				String[] palabra = linea.split(";");
				if (palabra[2].equals(a) && palabra[1].equals(s)) {
					contador1++;
				}
				if (palabra[2].equals(b) && palabra[1].equals(n)) {
					contador2++;
				}
			}
			System.out.println("El numero total de divorcios con separacion previa en 2019 es: " + contador1);
			System.out.println("El numero total de divorcios sin separacion previa en 2018 es: " + contador2);
			System.out.println("El numero total de divorcios con separacion previa en 2019 es: " + contador3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String nombre = "C:\\Users\\Javier\\Desktop\\Divorcios.csv";
		String a = "2019";
		String b = "2018";
		String s = "Si";
		String n = "No";
		leerFichero(nombre, a, b, s, n);
	}
}
