package org.generation;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapConceptos
{
	public static void main(String[] args)
	{
		/*

		 * Una colección Map, es una ralación clave(key): valor (value) que forma una tabla de datos
		 * -Nos funciona mejor para encontrar elementos
		 *Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();*/
		//Instancias la clase HashMap
		HashMap<Integer,String>funkos=new HashMap<>();
		
		//Agregar valores a la colección, put()
		funkos.put(1,"Batman");
		funkos.put(1329,"Spiderman");
		funkos.put(875,"Prision Mike");
		funkos.put(1062,"Dundie");
		funkos.put(703,"Rachiel");
		funkos.put(702,"Ross");
		funkos.put(1435,"GhostSpider");
		System.out.println(funkos);
		
		//Reemplazar un elemento
		funkos.put(1329,"Spiderman San Valentìn");
		System.out.println(funkos);
		
		//Obtener un elemento, get(key)
		System.out.println("Funko 1435: "+funkos.get(1435));
		
		//Eleminiar un elemento, remove(key)
		System.out.println("Eliminado: "+funkos.remove(1062));
		
		//Iterar la colección usando las keys
		for(Integer modelo:funkos.keySet())//keySet obtiene un arreglo de tipo String
		{
			System.out.println("2Funko: "+funkos.get(modelo));
		}
		
		//Iterar la colección con sus valores
		for(String nombreFunko:funkos.values())//Values entrega un arreglo de tipo String
		{
			System.out.println("3Funko: "+nombreFunko);
		}
		
		//Ordenar las claves
		TreeMap<Integer,String>funkosOrdenados=new TreeMap<>(funkos);
		System.out.println(funkosOrdenados);
	}

}
