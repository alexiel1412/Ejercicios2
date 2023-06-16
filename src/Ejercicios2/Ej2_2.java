package Ejercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej2_2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double num1, num2, num3, menor;
		
		System.out.println("Introduzca el primer número: ");
		menor = num1 = teclado.nextDouble();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextDouble();
		
		if (num2 < menor)
			menor = num2;
		System.out.println("Introduzca el tercer número: ");
		num3 = teclado.nextDouble();
		if (num3 < menor)
			menor = num3;
		/*
		if (menor >= num2)
			if (num3 >= num2)
				menor = num2;
			else
				menor = num3;
		else if (menor >= num3)
			menor = num3;
		*/
		DecimalFormat forma = new DecimalFormat ("######,##");
		System.out.println("El menor entre " + forma.format(num1) + ", " + forma.format(num2) + " y " + forma.format(num3)
			+ " es " + forma.format(menor) + ".");
		teclado.close();
	}

}
