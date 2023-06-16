package Ejercicios2;

import java.util.Scanner;

public class Ej2_5 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String ficha1, ficha2;
		System.out.println("Introduzca la ficha 1 (Ej: 3E): ");
		ficha1 = teclado.nextLine();
		System.out.println("Introduzca la ficha 2 (Ej: 3E): ");
		ficha2 = teclado.nextLine();
		int strFila1, strFila2;
		int col1, fila1 = 1, col2, fila2 = 1;
		col1 = Integer.parseInt(ficha1.substring(0, 1));
		strFila1 = ficha1.toLowerCase().charAt(1);
		col2 = Integer.parseInt(ficha2.substring(0, 1));
		strFila2 = ficha2.toLowerCase().charAt(1);
		
		fila1= strFila1 -'a'+1;
		fila2= strFila2 -'a'+1;
		
//		switch (strFila1)
//		{
//			case "a":
//				fila1 = 1;
//				break;
//			case "b":
//				fila1 = 2;
//				break;
//			case "c":
//				fila1 = 3;
//				break;
//			case "d":
//				fila1 = 4;
//				break;
//			case "e":
//				fila1 = 5;
//				break;
//			case "f":
//				fila1 = 6;
//				break;
//			case "g":
//				fila1 = 7;
//				break;
//			case "h":
//				fila1 = 8;
//				break;
//		}
//		switch (strFila2)
//		{
//			case "a":
//				fila1 = 1;
//				break;
//			case "b":
//				fila1 = 2;
//				break;
//			case "c":
//				fila1 = 3;
//				break;
//			case "d":
//				fila1 = 4;
//				break;
//			case "e":
//				fila1 = 5;
//				break;
//			case "f":
//				fila1 = 6;
//				break;
//			case "g":
//				fila1 = 7;
//				break;
//			case "h":
//				fila1 = 8;
//				break;
//		}
		
		/*
		System.out.println("FICHA 1 - Introduzca la columna: ");
		col1 = teclado.nextInt();
		System.out.println("FICHA 1 - Introduzca la fila: ");
		fila1 = teclado.nextInt();
		System.out.println("FICHA 2 - Introduzca la columna: ");
		col2 = teclado.nextInt();
		System.out.println("FICHA 2 - Introduzca la fila: ");
		fila2 = teclado.nextInt();
		*/
		System.out.println("Las fichas " + ficha1 + " y " + ficha2 + ":");
		if (col1 == col2 && fila1 == fila2)
			System.out.println("Estaan en la misma casilla.");
		else 
		{
			if (col1 == col2)
				System.out.println("Estan en la misma columna.");
			else if (fila1 == fila2)
				System.out.println("Estan en la misma fila.");
			else if (Math.abs(col1 - col2) == Math.abs(fila1 - fila2))
				System.out.println("Estan en diagonal.");
			else
				System.out.println("No coinciden en nada.");
		}
		teclado.close();

	}

}
