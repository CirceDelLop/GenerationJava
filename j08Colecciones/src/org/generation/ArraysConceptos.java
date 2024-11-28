package org.generation;

public class ArraysConceptos
{
	public static void main(String[] args)
	{
		/*
		 *  Las variables de tipo array se definen con corchetes []. Los corchetes pueden ir antes o después de la variable ej.
		 *  int[] myArray;
		 *  int myArray[]
		 *Para los array se debe asignar la cantidad de elementos que contendrá. Una vez definido, el arreglo no púede cambiar su tamaño*/
		//Definr un arreglo de 4 elemento de tipo int
		//Se crea un objeto de tipo array de integers
		int[] codigoColores=new int[4];//Por default sus valores iniciales son [0,0,0,0]
		
		//Inicializar un arreglo al declararlo
		String[] frutas= {"Uva","Fresa","Manzana"};
		
		//Crea un arreglo que pueda almacenar 4 nombres de automóviles
		String[] autos=new String[4];
		
		//Agregar el nombre de automovil en el índice 0
		autos[0]="Tesla";
		
		//Agregar otro nombre en el índice 1, 2 y 3
		autos[1]="Vento";
		autos[2]="Caribe";
		autos[3]="Audi";
		//Si se intenta acceder a un elemento que no existe, se genra una excepción en tiempo de ejecución
		
		//Iterando un arreglo usando el ciclo for
		for(int i=0;i<autos.length;i++)
		{
			System.out.println("Nombre del auto: "+autos[i]);
		}
		
		//Ciclo for enhanced
		for(String auto:autos)
		{
			System.out.println("Auto: "+auto);
		}
		
		// Generar un arreglo de 2 dimensiones
		String[][] participantes = new String[3][5]; // 3 filas, 5 columnas
	}
}
