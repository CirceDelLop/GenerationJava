package org.generation;

public class OperadoresCondicionales
{

	public static void main(String[] args)
	{
		/*Los operadores evaluan valores booleanos. Tienen el comportamiento de corto circuito: Solo se evalua si es necesario.
		 * && condicional AND (y)
		 * || condicional OR (o)*/
		
		int value1=1;
		int value2=2;
		
		if((value1==1)&&(value2==2))
			System.out.println("value1 es 1 Y value2 es 2");//Se imprime
		if((value1==1)||(value2==1))
			System.out.println("value1 es 1 O value2 es 1");//Se imprime
	}

}
