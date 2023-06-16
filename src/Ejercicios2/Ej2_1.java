package Ejercicios2;

import java.util.Scanner;

public class Ej2_1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, menor, mayor;
		// int menor, mayor;
		System.out.println("Introduzca un número:");
		num1 = teclado.nextInt();
		System.out.println("Introduzca otro número:");
		num2 = teclado.nextInt();
		if (num1 == num2)
			System.out.println(num1 + " y " + num2 + " son iguales.");
		else
			if (num1 > num2)
				System.out.println(num1 + " es mayor que " + num2);
			else
				if (num1 == num2)
					System.out.println(num1 + " y " + num2 + " son iguales.");
				else
					System.out.println(num2 + " es mayor que " + num1);
			/*
			menor = Math.min(num1, num2);
			mayor = Math.max(num1, num2);
			System.out.println(mayor + " es mayor que " + menor);
			*/
		teclado.close();
	}

}
