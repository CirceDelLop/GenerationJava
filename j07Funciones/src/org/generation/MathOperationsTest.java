package org.generation;

public class MathOperationsTest 
{

	public static void main(String[] args)
	{
		//Instanciar una clase
		MathOperations math1=new MathOperations();
		double result=math1.sumarNumeros(5,5.5);
		math1.imprimirResSumatoria(result);
		//Suma 5+8.8=13.8 e imprimir en consola
		result=math1.sumarNumeros(5, 8.8);
		math1.imprimirResSumatoria(result);
		// Suma "4" + "10.8" = 14.8 e imprime en consola
		 double numA = Double.parseDouble("4");
		 double numB = Double.parseDouble("10.8");	 

		 result = math1.sumarNumeros( numA, numB );
		 //result = math1.sumarNumeros("4", "10.8");
		 math1.imprimirResSumatoria(result); // 14.8
		 
		// Realizar los cambios necesarios en la clase MathOperations para que se pueda realizar la suma con 
		 result = math1.sumarNumeros("34", 5.4);	 
		 math1.imprimirResSumatoria(result); // 39.4 
		 result = math1.sumarNumeros(34, "5.4");	 
		 math1.imprimirResSumatoria(result); // 39.4
	}
}
