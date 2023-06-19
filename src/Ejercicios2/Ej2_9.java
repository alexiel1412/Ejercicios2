package Ejercicios2;

import java.util.Scanner;

public class Ej2_9
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		double imp = 0;
		double desc = 10;
		double retenc;
		double totalRetenc = 0;
		System.out.println("Introduzca su saldo: ");
		double sueldo = teclado.nextDouble();
		double resto = sueldo;
		System.out.println("Introduzca su número de hijos: ");
		int hijos = teclado.nextInt();
		if (sueldo < 0 || hijos < 0)
		{
			System.out.println("Datos incorrectos.");
			return;
		}
		else
		{
			if (resto < 1000)
				System.out.println("Estas exento de impuestos.");
			else
			{
				resto = resto - 1000;
				if (resto > 1600 - 1000)
					retenc = 600 * 0.05;
				else
				{
					retenc = resto * 0.05;
					resto = 0;
				}
				retenc = retenc * (1 - Math.min((hijos * 0.01), 0.1));
				totalRetenc = totalRetenc + retenc;
				
				if (resto  > 3000 - 1600)
				{
					retenc = 1600 * 0.1;
					resto = resto - 1600;
				}
			}
			
			
			/*
			if (sueldo >= 4600)
			{
				desc = 1.5 * hijos;
				if (desc > 15)
					desc = 15;
				imp = 20;
			}
			else if (sueldo >= 3000)
				imp = 15;
			else if (sueldo >= 1600)
				imp = 10;
			else if (sueldo >= 1000)
				imp = 5;
			else
				desc = 0;
			*/
			double impFinal = imp - (imp * desc / 100);
			System.out.println("Con un sueldo de " + sueldo + " y " + hijos + " hijos:");
			System.out.println("Le afecta el impuesto de " + imp + " %, y un descuento de " + desc + " %.");
			System.out.println("Impuesto final: " + impFinal + ", lo cual sería " + (sueldo * impFinal / 100));
			System.out.println("Sueldo final: " + (sueldo - sueldo * impFinal / 100));
		}
	}

}
