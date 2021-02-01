package com.java;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Escribe un metodo que se llame hasEqualSum con 3 parametros de tipo int.
//
//		El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros es igual a la suma del tercer parametro, en otro caso devolver false.
//
//		Aqui algunos ejemplos de input y output:
//
//		* hasEqualSum(1, 1, 1); deberia regresar FALSE porque la suma de 1+1 no es 1
//
//		* hasEqualSum(1, 1, 2); deberia regresar TRUE porque la suma de 1+1 si es 2
		int n1 = 1;
		int n2 = 0;
		int n3 = 2;
		
		boolean isEqualsum= hasequalsum(1,2,3);
		System.out.println("El valor es: "+isEqualsum);
		
	}
	public static boolean hasequalsum(int parametro1, int parametro2, int parametro3) {
		
			
		if (parametro1+parametro2 == parametro3) {
			
			return true;
		}else {
			return false;
		}
	}
	

}
