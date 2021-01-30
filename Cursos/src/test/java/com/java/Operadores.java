package com.java;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Operadores
		
		int x = 6;
		int y = 4;
		
		int z = x % y;
		
		System.out.println("Este es el valor de Z es " +z);
		
		//Unarios
		
		int A = 1;
		int B = 4;
		
		System.out.println("Este es el valor de :"+ ++B);
		
		//Relacionales
		
		if(A <= B) {
			System.out.println("Block code");
		}
		
		//Condicionales
		
		int var1 = 5;
		int var2 = 6;
		int var3 = 5;
		int var4 = 5;
		
		if(var1 == var2 || var3 == var4) {
			System.out.println("Black code2");
		}
	}

}
