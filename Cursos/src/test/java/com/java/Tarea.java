package com.java;

public class Tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		imprimirVerificadorNumeros(1,1,1);
		System.out.println(isCatPlaying(true,10));
		
	}
	public static void imprimirVerificadorNumeros(int n1, int n2 ,int n3) {
		
		
		if(n1 <=0 || n2<= 0 || n3<=0) {
			System.out.println("Valor no valido. Uno o mas valores son iguales o menores a 0");
		}else if(n1 == n2 && n2 == n3 && n3 == n1) {
			System.out.println("Todos los numeros son iguales.");
		}else if(n1 != n2 && n2 != n3 && n3 != n1) {
			System.out.println("Todos los numeros son diferentes.");
		}else {
			System.out.println("Ni todos son iguales o diferentes");
		}
		
	}
	
	public static boolean isCatPlaying (boolean verano, int temperatura ) {
		
		boolean jugando = false;
//		if(temperatura >= 25 && temperatura <= 45) {
//			
//			if(verano) {
//				jugando = true;
//			}	
//		}
//		if(temperatura >= 25 && temperatura <= 35) {
//			
//			jugando = true;
//		}
		
		if(!verano) {
			if(temperatura >= 25 && temperatura <= 35) {			
			jugando = true;
			}
		}
		return jugando;
	}
	
}
