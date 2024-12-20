package org.generation;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CondicionalIf
{
	public static void main(String[] args)
	{
		/*Flujos de control: Las sentencias de flujo de control interrumpen el flujo de ejecución empleando toma de decisiones, bucles y ramificaciones, lo que permite que el programa ejecute condicionalmente bloques de código particulares.
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { sentencias; }
		 * 
		 * if ( condicional ) sentencia; else sentencia_Si_condicional_es_falsa;
		 *  
		 * if ( condicional )
		 *   sentencia; 
		 * else if ( nueva_condicional) 
		 *   sentencia; 
		 * else if ( n_condición ) 
		 *   sentencia; 
		 * else sentencia;*/
		//Verificar la edad de una persona. Si es mayor o igual de 18, imprimir "Puede votar", caso contrario, "No puede votar"
		int edad=10;
		if(edad>=18)
			System.out.println("Puede votar");
		else
			System.out.println("No puede votar");
		/*De una variable tipo int, evaluar si está en el rango de 1 al 10, si es así, desplegar en consola "La selección está en el rango", en caso contrario "La selección está fuera de rango"*/
		int valor=10;
		if(valor>=1 && valor<=10)
			System.out.println("La selección está en el rango");
		else 
			System.out.println("La selección está fuera del rango");
		
		/*Operador ternario.
		 * Sintaxis: expresión ? respuestaSiEsTrue : respuestaSieSFaalse*/
		//Realizar el ejercicio anterior usando el operador ternario
		System.out.println((valor >= 1 && valor <= 10) ? "Dentro del rango" : "Fuera del rango");
		
		/*Clase Scaner: Permite que el usuario ingrese datos*/
		Scanner sc;//variable de tipo clase scanner. Se tiene que importar la clase Scanner para poder usarla
		/*npm (Node Package Manager): Instala, actualiza y gestiona dependencias
		 *npx (Node Package eXecute): Permite ejecutar comandos directamente desde paquetes sin necesidad de instalarlos globalmente*/
	}

}
