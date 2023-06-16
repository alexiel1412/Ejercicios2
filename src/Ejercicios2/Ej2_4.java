package Ejercicios2;

import java.util.Scanner;

public class Ej2_4 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Introduzca el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num3 = teclado.nextInt();
		
		if (num1 + num2 > num3)
		{
			if (num2 + num3 > num1)
				if (num3 + num1 > num2)
					System.out.printf("El triángulo de lados %d, %d y %d si existe", num1, num2, num3);
		}
		else
			System.out.printf("El triángulo de lados %d, %d y %d no existe", num1, num2, num3);
		
		if ((num1 + num2 > num3) && (num2 + num3 > num1) && (num3 + num1 > num2))
			System.out.printf("El triángulo de lados %d, %d y %d si existe", num1, num2, num3);
		else
			System.out.printf("El triángulo de lados %d, %d y %d no existe", num1, num2, num3);
	}

}
