package Ejercicios2;

import java.util.Scanner;

public class Ej2_7
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el año:");
		int anyo = teclado.nextInt();
		boolean bis = true;
		if (anyo % 4 == 0)
		{
			if (anyo % 100 == 0 && anyo % 400 != 0)
				bis = false;
		}
		else
			bis = false;
		
		if (bis)
			System.out.println("El año " + anyo + " es bisiesto.");
		else
			System.out.println("El año " + anyo + " no es bisiesto.");
		teclado.close();
	}

}
