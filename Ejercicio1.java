package Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Pre:--- 
 * Post:Este ejercicio consiste en que, dado un fichero txt, hay que
 * leer el fichero e imprimir por pantalla las palabras que empiecen y o
 * terminen por la letra del abecedario ya determinada. Una vez sacadas las
 * palabras hay que poner en que linea del fichero estan.
 *
 */
public class Ejercicio1 {
	/**
	 * Pre:--- 
	 * Post:En este metodo llamado leer, es donde leeremos el fichero txt,
	 * para sacar las palabras y su linea del texto correspondiente.
	 */
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

	/**
	 * Pre:--- Post:En el main le pasaremos la ruta de nuestro fichero y le
	 * pasaremos la letra del abecedario
	 */
	public static void main(String[] args) throws Exception {
		String nombreFichero = "C:\\Users\\Javier\\Desktop\\HablanosDelDon.txt";
		String letra = "a";
		leer(nombreFichero, letra);
	}
}
