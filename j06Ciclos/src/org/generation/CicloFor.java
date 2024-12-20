package org.generation;

public class CicloFor
{

	public static void main(String[] args) 
	{
		/*Sintaxis:
		 * for(expresionInicial;comparacion;espresionFinal)
		 * {bloque de codigo}
		 * for(expresionInicial;comparacion;espresionFinal)
		 * bloque de codigo*/
		for(int iteracion=1;iteracion<6;iteracion++)
		{
			System.out.println("Núm. iteración "+iteracion);
		}
		//Ejercicio mental
		int iteracion=1;
		for(;;)
		{
			if(iteracion>5) break;
			System.out.println("Núm. Iteración: "+iteracion++);
		}
		System.out.println("Valor final de iteracion: "+iteracion);
		
		ciclo://Es una etiqueta que identifica un ciclo for
			for(int i=0;i<5;i++)
			{
				System.out.println("Valor de i: "+i);
				if(i>3) break ciclo;
			}
		//Qué imprime la línea 37? 0,1,2,3,4
		
		principal:
			for(int i=1;i<=5;i++)
			{
				secundario:
					for(int j=1;j<=10;j++)
					{
						System.out.println(i+"*"+j+"="+(i*j));
						if(j>=7) break principal;
					}
			}
		//¿Qué tablas de multiplicar se imprimen? la del uno hasta el por 7
		
		//Continue: Se usa para saltar la iteración actual del bucle y continuar con siguiente iteración
		//Imprimir los números impares del 1 al 20 (incluyendo)
		for(int i=1;i<=20;i++)
		{
			if(i%2==0) continue;//Si se cumple la condición, se pasa a la siguiente iteración sin ejecutar las líneas de código siguientes
			System.out.println("1: Valor impar: "+i);
		}
		
		for(int i=1;i<=20;i+=2)
		{
			System.out.println("2: Valor impar: "+i);
		}
		
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0) System.out.println("3: Valor impar: "+i);
		}
	}

}
