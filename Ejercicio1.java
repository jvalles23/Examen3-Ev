package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
	private static void leer(String nombre, String p) {
		File file = new File(nombre);
		try {
			int contador = 0;
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				linea = linea.replaceAll(",", "").replaceAll("\\.", "").replaceAll("\\;", "").replaceAll("\\?", "")
						.replaceAll("\\¿", "");
				String[] lineadividida = linea.split(" ");
				contador++;
				for (int i = 0; i < lineadividida.length; i++) {
					String palabra = lineadividida[i];
					if (palabra.substring(0, 1).equals(p) || palabra.substring(palabra.length() - 1).equals(p)) {
						System.out.println("Palabra: " + palabra + " ---- " + " Linea: " + contador);
					}
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String nombreFichero = "C:\\Users\\Javier\\Desktop\\HablanosDelDon.txt";
		String letra = "s";
		leer(nombreFichero, letra);
	}
}
