package Ejercicio4;

import java.util.Scanner;

/**
 * Pre: ---
 * Post:Este programa se encarga de, dado un numero entero muestre su tabla de multiplicar
 * 		pero de los numeros pares hasta el 100.
 *
 */
public class Ejercicio4 {
	public static int tablaMultiplicar(int numero) {
			if(numero == 0) {
				return 0;
			}else {
				return tablaMultiplicar(numero + 1);
			}
		}	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el numero a multiplicar: ");
		int numero = entrada.nextInt();
		System.out.print(tablaMultiplicar(numero));
	}
}
