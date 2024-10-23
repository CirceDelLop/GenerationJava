package org.generation;

import java.util.Scanner;

public class While
{

	public static void main(String[] args)
	{
		/*Ciclo While: Mientras la condición sea verdadera, se realiza un nuevo ciclo
		 * Sintaxis:
		 * while(condicion) intrucción;
		 * while(condicion)
		 * {bloque de código}*/
		/*Mostrar en la consola un mensaje de bienvenida
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "sí" volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse*/
		Scanner sc=new Scanner(System.in);
		boolean isActive=true;
		while(isActive)
		{
			System.out.println("Bienvenida a mi progama");
			System.out.print("¿Quieres seguir activa (s/n)? ");
			char response=sc.nextLine().toLowerCase().charAt(0);//Normalizar la respuesta y devolver/tomar un caracter en el indice que se indica
			if(response!='s'&&response!='y')
			{
				isActive=false;
			}
		}
		
		System.out.println("Regresa pronto");
		sc.close();
	}
	
	
}
