package Ejercicios2;

import java.util.Scanner;

public class Ej2_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double num1 = 0, num2 = 0, res;
		System.out.println("Introduzca el calculo:");
		System.out.println("\"+\" --- Suma.");
		System.out.println("\"-\" --- Resta.");
		System.out.println("\"*\" --- Multiplicación.");
		System.out.println("\"/\" --- División.");
		System.out.println("\"r\" --- Raíz.");
		System.out.println("\"p\" --- Potencia.");
		char oper = teclado.next().charAt(0);
		if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == 'r' || oper == 'p')
		{
			System.out.println("Introduzca el primer número:");
			num1 = teclado.nextInt();
			if (oper != 'r')
			{
				System.out.println("Introduzca el segundo número:");
				num2 = teclado.nextInt();
			}
		}
		
		switch (oper)
		{
			case '+':
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				res = num1 - num2;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '/':
				res = num1 / num2;
				break;
			case 'r':
				res = Math.sqrt(num1);
				break;
			case 'p':
				res = Math.pow(num1, num2);
				break;
			default:
				System.out.println("Error, debe introducir una operación de la lista.");
				return;  // Para no lanzar el resultado si hay error
		}
		System.out.println(res);
		teclado.close();
	}
}
