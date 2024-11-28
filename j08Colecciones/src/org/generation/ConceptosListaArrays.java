package org.generation;

import java.util.ArrayList;

public class ConceptosListaArrays
{
	public static void main(String[] args)
	{
		/*Array List. https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		 *Una colección List es una colección ...?
		 *-Es una colección ordenada (respeta el orden en que se agregan)
		 *-Se permite elementos duplicados
		 *-Se basa en un array redimensionable que crece su tamaño, según crece la colección de elementos.
		 *-Esta colección es la mejor rendimiento tiene. 
		 *Sintaxis:
		 *  ArrayList<object> varName = new ArrayList<>();*/
		int age=17;
		Integer edad=18;
		
		//Definir una colección de datos númericos
		ArrayList<Integer>numeros;//No se puede trabajar con datos primitivos, se debe indicar una clase (wrapper)
		
		//Definir una colección de Strings para almacenar las etiquetas de Ivanna
		ArrayList<String>nombreEtiquetas;
		
		//Crear el objeto de la colección
		nombreEtiquetas=new ArrayList<>();
		
		//Agregar un elemento con el método add()
		nombreEtiquetas.add("Coca-cola");//Se agrega en el índice 0
		
		//Agregar 5 elementos más a la colección
		nombreEtiquetas.add("Toxic");
		nombreEtiquetas.add("Peanuts");
		nombreEtiquetas.add("Vans");
		nombreEtiquetas.add("Disney");
		nombreEtiquetas.add("Mala Racha");
		
		//Agregar un elemento duplicado
		nombreEtiquetas.add("Vans");
		
		//Obtener el tamaño de una colección, size()
		System.out.println(nombreEtiquetas.size());
		
		//Mostrar un elemento en particular indicando el número de índice
		System.out.println(nombreEtiquetas.get(1));
		
		//Mostrar el elemento "Mala Racha"
		System.out.println(nombreEtiquetas.get(5));
		
		//Remover un elemnto, remove()
		System.out.println("Eliminado :"+nombreEtiquetas.remove(3));
		System.out.println("Eliminado :"+nombreEtiquetas.remove("Disney"));
		System.out.println(nombreEtiquetas);
		
		//Verificar si un elemento existe, contains()
		System.out.println("Vans?: "+nombreEtiquetas.contains("Vans"));
		System.out.println("Cuidado con el perro?: "+nombreEtiquetas.contains("Cuidado con el perro"));
		
		//Iterar una colección usando el ciclo for
		for(int i=0;i<nombreEtiquetas.size();i++)
		{
			System.out.println("1 Etiqueta: "+nombreEtiquetas.get(i));
		}
		
		//Iterar una colección usando el ciclo for enhanced
		for(String etiqueta:nombreEtiquetas)
		{
			System.out.println("2 Etiqueta: "+etiqueta);
		}
		
		//Reemplazar un elemento, set()
		nombreEtiquetas.set(0,"Red Label");
		System.out.println(nombreEtiquetas);
	}

}
