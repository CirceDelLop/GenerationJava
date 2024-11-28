package com.petco;

import java.util.Scanner;

public class CrearGato
{
	static public Cat registroGato()
	{
		Cat gato=new Cat();
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre de su gato: ");
		gato.setNombre(sc.nextLine());
		System.out.print("Ingrese el color del pelaje de su gato: ");
		gato.setColorPelaje(sc.nextLine().toLowerCase());
		System.out.print("Ingrese la edad de su gato: ");
		gato.setEdad(sc.nextInt());
		sc.close();
		return gato;
	}
}
