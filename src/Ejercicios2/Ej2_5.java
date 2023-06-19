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
		
		int col1, fila1 = 1, col2, fila2 = 1;
		int strCol1, strCol2;
		
		// fila1 = Integer.parseInt(ficha1.substring(0, 1));
		fila1 = ficha1.charAt(0) - '0';
		strCol1 = ficha1.toUpperCase().charAt(1);
		// fila2 = Integer.parseInt(ficha2.substring(0, 1));
		fila2 = ficha2.charAt(0) - '0';
		strCol2 = ficha2.toUpperCase().charAt(1);
		
		col1 = strCol1 - 'A' + 1;
		col2 = strCol2 - 'A' + 1;
		
//		switch (strCol1)
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
//		switch (strCol2)
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
		
		System.out.printf("Las fichas %d-%c y %d-%c:\n", fila1, strCol1, fila2, strCol2);
	 // System.out.printf("Las fichas %d-%s y %d-%s:\n", fila1, strCol1, fila2, strCol2);   --- Esto me falla
		
		// System.out.println("Las fichas " + ficha1 + " y " + ficha2 + ":");
		if (fila1 == fila2 && col1 == col2)
			System.out.println("Estan en la misma casilla.");
		// return;   --- se saldría de la función main para que no siga ejecutándose
		// System.exit(0);   --- Sale del programa indicando un código de error, el 0 indica que todo va bien
		else 
		{
			if (col1 == col2)
				System.out.println("Estan en la misma columna.");
			else if (fila1 == fila2)
				System.out.println("Estan en la misma fila.");
			else if (Math.abs(fila1 - fila2) == Math.abs(col1 - col2))
				System.out.println("Estan en diagonal.");
			else
				System.out.println("No coinciden en nada.");
		}
		teclado.close();

	}

}
