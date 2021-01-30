package com.java;

public class Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WHILE

		int numero = 1;

		while (numero <= 10) {
			System.out.println("El numero es " + numero);
			++numero;
		}

		// DO WHILE cuantas veces se tiene que sumer un num para llegar a100

		int numerolimite = 20;
		int sumtotal = 0;
		int contador = 0;

		do {
			sumtotal += numerolimite;
			++contador;
		} while (sumtotal < 100);

		System.out.println("el numero se sumo " + contador + " veces");

		int numerofor = 10;

		for (int i = 0; i <= numerofor; i++) {

			System.out.println("El numero es " + i);
		}
	}

}
