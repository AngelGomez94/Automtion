package com.java;

public class CondicionalStatemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 120; //KM X H
		int LimiteVelocidad = 80;
		
//		if(velocidad > LimiteVelocidad) {
//			System.out.println("El coche va a exeso de velicidad");
//		}else {
//			System.out.println("El coche va a la velocidad adecuada");
//		}
//		
		//IF ANIDADO / IF ELSE
		
		boolean carretera = true;
		
		if(carretera) {
			
			System.out.println("Estas en una carretera");
			
			LimiteVelocidad = 110;
			
			if(velocidad > LimiteVelocidad) {
				System.out.println("El coche va a exeso de velocidad");
			}else {
				System.out.println("El coche va a la velocidad adecuada");
			}
		}else if(velocidad > LimiteVelocidad) {
			
			System.out.println("El coche esta en una calle y va a exeso de velocidad");
		}else {
			
			System.out.println("El coche esta en una calle y va a una velocidad adecuada");
		}

		
		//switch case
		
		int temperatura = 30;
		
		switch(temperatura) {
		
		case 5:
			System.out.println("Mucho frio");
			break;
			
		case 10:
			System.out.println("Frio");
			break;
		
		case 20:
			System.out.println("Clima agradable");
			break;
			
		case 30:
			System.out.println("Clima caliente");
			break;
			
		default:
			System.out.println("No encontro relacion con la temperatura");
		
		}
		
	}

}
