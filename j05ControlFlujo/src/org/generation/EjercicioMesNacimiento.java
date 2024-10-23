package org.generation;

import java.util.Scanner;

public class EjercicioMesNacimiento
{
	public static void main(String[] args)
	{
		//Switch usa el método equals para comparar los Strings
		/*Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto. Ej:entrada-> "Escribe tu mes de nacimiento: " 12, salida-> Naciste en diciembre.*/
		Scanner sc=new Scanner(System.in);
		System.out.print("En número, ingresa el mes en que naciste: ");
		int mes=sc.nextInt();
		
		switch(mes)
		{
			case 1:
				System.out.println("Naciste en enero.");
				break;
			case 2:
				System.out.println("Naciste en febrero.");
				break;
			case 3:
				System.out.println("Naciste en marzo.");
				break;
			case 4:
				System.out.println("Naciste en abril.");
				break;
			case 5:
				System.out.println("Naciste en mayo.");
				break;
			case 6:
				System.out.println("Naciste en junio.");
				break;
			case 7:
				System.out.println("Naciste en julio.");
				break;
			case 8:
				System.out.println("Naciste en agosto.");
				break;
			case 9:
				System.out.println("Naciste en septiembre.");
				break;
			case 10:
				System.out.println("Naciste en octubre.");
				break;
			case 11:
				System.out.println("Naciste en noviembre.");
				break;
			case 12:
				System.out.println("Naciste en diciembre.");
				break;
			default:
				System.out.println("Ese mes no existe.");
				break;
		}
	}

}
