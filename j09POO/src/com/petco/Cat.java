package com.petco;

import java.util.Scanner;

public class Cat
{
	//Definir mínimo 2 atributos non-static
	String nombre;
	String colorPelaje;
	int edad;
	int porcion;
	
	//Definir mínimo 1 atributo statico
	static String mensaje="Ahora tendra una indentificación con su inofrmación proporcionada";
	//Realizar mínimo 1 método no estatico
	String ingresarInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese el nombre de su gato: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese el color del pelaje de su gato: ");
		colorPelaje=sc.nextLine().toLowerCase();
		System.out.print("Ingrese la edad de su gato: ");
		edad=sc.nextInt();
		sc.close();
		return nombre;
	}
	
	void imprimirInfo()
	{
		System.out.println("Tu gato se llama "+nombre+" tiene "+edad+" años y su pelaje es de color "+colorPelaje);
	}
	//Realizar mínimo 1 método estatico
	static String imprimirMensaje()
	{
		return mensaje;
	}
	
	//Método no estatico 'toString': Devuelve la representación en formato String del objeto. Permite que el objeto se convierta en una cadena cuando se imprima o se necesite en formato de texto
	public String toString()
	{
		return "El gato "+nombre+"\n Edad: "+edad+"\n Color pelaje: "+colorPelaje;
	}
}
