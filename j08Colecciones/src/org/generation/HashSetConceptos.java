package org.generation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetConceptos
{
	public static void main(String[] args)
	{
		/*Una colección de tipo set es una colección NO ordenada.
		 *-No se permiten elementos duplicados

		 *-Cualquier elemento duplicado no se insertará
		 *Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();*/
		HashSet<String> medallas=new HashSet<>();
		//Agregar elementos, add()
		medallas.add("Split");
		medallas.add("Perrotón");
		medallas.add("Medio Maratón CDMX");
		medallas.add("Maratón");
		medallas.add("Bimbo");
		
		//Agregar un elemento duplicado
		System.out.println("Agregado?: "+medallas.add("Gatorade"));
		System.out.println("Agregado?: "+medallas.add("Gatorade"));
		System.out.println(medallas);
		
		//Obtener el tamaño de la colección, size()
		System.out.println(medallas.size());
		
		//Saber si un elemento existe, contains()
		System.out.println("Gatorade? "+medallas.contains("Gatorade"));
		System.out.println("Olimpica? "+medallas.contains("Olimpica"));
		
		//Remover un elemtno, remove()
		System.out.println("Eliminando Maratón CDMX?: "+medallas.remove("Maratón CDMX"));
		
		//Iterar la colección usando el ciclo for enhanced
		for(String medalla:medallas)
		{
			System.out.println("Medalla: "+medalla);
		}
		
		ArrayList<String>nombreEtiquetas;
		nombreEtiquetas=new ArrayList<>();
		
		nombreEtiquetas.add("Coca-cola");
		nombreEtiquetas.add("Toxic");
		nombreEtiquetas.add("Peanuts");
		nombreEtiquetas.add("Vans");
		nombreEtiquetas.add("Disney");
		nombreEtiquetas.add("Mala Racha");
		nombreEtiquetas.add("Toxic");
		nombreEtiquetas.add("Vans");
		
		//Eliminar elementos duplicados
		//HashSet<String>etiquetasNoDuplicadas=new HashSet<>(nombreEtiquetas);
		HashSet<String> etiquetasNoDuplicadas = new HashSet<>();
		etiquetasNoDuplicadas.add( "Nike" );		etiquetasNoDuplicadas.addAll( nombreEtiquetas );
		System.out.println( etiquetasNoDuplicadas );
				
		//Eliminar elementos duplicados respetando el orden
		LinkedHashSet<String>etiquetasNoDupOrdenadas=new LinkedHashSet<>(nombreEtiquetas);
		System.out.println(etiquetasNoDupOrdenadas);
		//System.out.println(medallas.hashCode());//Para saber el identificador
	}
}
