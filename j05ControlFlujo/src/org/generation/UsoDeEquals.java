package org.generation;

public class UsoDeEquals
{
	public static void main(String[] args)
	{
		//Dato inmutable: No se puede modificar
		//Los String, en java, son objetos inmutables
		String nombre="Lizbeth";
		nombre="Lorena";
		
		String persona="Lizbeth";
		
		//Con el operador == en los objetos se verfica la referencia en memoria
		if(persona=="Lizbeth")
		{
			System.out.println("Es la misma persona");
		}
		else
		{
			System.out.println("No es la persona");
		}
		
		//Forzar la creación de un nuevo objeto
		String name= new String("Lizbeth");
		if(name=="Lizbeth")
		{
			System.out.println("Es la misma persona");
		}
		else
		{
			System.out.println("No es la persona");
		}
		
		if(name.equals("Lizbeth"))//.equals compara el contenido del string, no la referencia de memoria. Es la manera correcta de comparar los strings
		{
			System.out.println("Es la misma persona");
		}
		else
		{
			System.out.println("No es la persona");
		}
	}
}
