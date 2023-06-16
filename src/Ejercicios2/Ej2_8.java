package Ejercicios2;

import java.util.Scanner;

public class Ej2_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el primer número:");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número:");
		int num2 = teclado.nextInt();
		System.out.println("Introduzca el calculo:");
		System.out.println("\"+\" --- Suma.");
		System.out.println("\"-\" --- Resta.");
		System.out.println("\"*\" --- Multiplicación.");
		System.out.println("\"/\" --- División.");
		System.out.println("\"p\" --- Potencia.");
		System.out.println("\"r\" --- Raiz.");
		char oper = teclado.next().charAt(0);
		
		switch (oper)
		{
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
				break;
			case 'r':
				System.out.println("Raiz cuadrada " + num1 + " = " + (Math.sqrt(num1)));
				break;
			case 'p':
				System.out.println(num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
				break;
			default:
				System.out.println("Error, debe introducir una operación de la lista.");
				break;
		}
		teclado.close();
	}
}
