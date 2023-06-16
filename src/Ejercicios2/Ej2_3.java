package Ejercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej2_3
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		float num1, num2, num3, medio;
		System.out.println("Introduzca el primer número: ");
		medio = num1 = teclado.nextFloat();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextFloat();
		System.out.println("Introduzca el tercer número: ");
		num3 = teclado.nextFloat();
		
		if (num1 == num2 || num2 == num3 || num3 == num1)
			System.out.println("Meta 3 números distintos.");
		else
		{
			if (num1 <= num2 && num2 <= num3)
				medio = num2;
			else if (num1 <= num3 && num3 <= num2)
				medio = num3;
		
			DecimalFormat forma = new DecimalFormat ("######.######");
			System.out.println("El de en medio entre " + forma.format(num1) + ", " + forma.format(num2) + " y " +
					forma.format(num3) + " es " + forma.format(medio) + ".");
		}
		teclado.close();
	}

}
