package Ejercicio2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pre: ---
 * Post:Este ejercicio trata de dado el fichero  Divorcios.csv, he mostrado los divorcios
 * 		con separacion previa en 2019 y los divorcios sin separacion previa en 2018. 
 * 		Para esto he implementado el método de leerFichero donde he metido varios contadores
 * 		cada uno para una información distinta.
 *
 */
public class Ejercicio2 {
	public static void leerFichero(String nombre, String a, String b, String s, String n) {
		ArrayList<Provincias> p = new ArrayList<Provincias>();
		File file = new File(nombre);
		int contadorL = -1;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		double sum = 0;
		try {
			/**
			 * Pre:---
			 * Post:Aqui leemos el fichero y al ser fichero.csv lo splitearemos por ;
			 * 		Con el contadorL lo que hacemos es saltarnos la primera linea para que
			 * 		no nos la lea.
			 */
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
				p.add(p.get);
			}
			System.out.println("El numero total de divorcios con separacion previa en 2019 es: " + contador1);
			System.out.println("El numero total de divorcios sin separacion previa en 2018 es: " + contador2);
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
