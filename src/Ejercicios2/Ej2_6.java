package Ejercicios2;

import java.util.Scanner;

public class Ej2_6 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double lin1A, lin1B, lin1C;
		double lin2A, lin2B, lin2C;
		
		System.out.println("Línea 1: ");
		System.out.println("Introduzca A: ");
		lin1A = teclado.nextDouble();
		System.out.println("Introduzca B: ");
		lin1B = teclado.nextDouble();
		System.out.println("Introduzca C: ");
		lin1C = teclado.nextDouble();
		
		System.out.println("Línea 2: ");
		System.out.println("Introduzca A: ");
		lin2A = teclado.nextDouble();
		System.out.println("Introduzca B: ");
		lin2B = teclado.nextDouble();
		System.out.println("Introduzca C: ");
		lin2C = teclado.nextDouble();
		
		System.out.println("lin1A / lin2A " + lin1A / lin2A + " lin1B / lin2B " + lin1B / lin2B);
		System.out.println("lin1A / lin1B " + lin1A / lin1B + " (-lin2B) / lin2A " + (-lin2B) / lin2A);
		System.out.println("lin1B / lin2B " + lin1B / lin2B + " lin1C / lin2C " + lin1C / lin2C);
		
		if (lin1A / lin2A != lin1B / lin2B)
			if (lin1A / lin1B == (-lin2B) / lin2A)
				System.out.println("Las líneas son perpendiculares: ");
			else
				System.out.println("Las líneas son secantes: ");
		else if (lin1B / lin2B == lin1C / lin2C)
			System.out.println("Las líneas son coincidentes: ");
		else
			System.out.println("Las líneas son paralelas: ");
		teclado.close();
	}

}
