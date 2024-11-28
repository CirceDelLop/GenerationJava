package org.generation;
import java.util.Random;

public class MeLate
{
	/**Método que genere un número aleatorio del 1 al 57: retornar un número de tipo int*/
	/*
	 * int generarNumeroAleatorio() { Random random = new Random(); return
	 * random.nextInt(57) + 1; // Genera un número entre 0 y 56, luego suma 1 }
	 */
	int generateRandomNumber()
	{
		int min = 1;
	    int max = 57;

	    // Generar un número aleatorio entre 0.0 y 1.0
	    double randomValue = Math.random();

	    // Escalar el número aleatorio al rango deseado (entre 1 y 57)
	    double scaledRandomValue = randomValue * (max - min + 1);

	    // Convertir el número escalado en un entero redondeado hacia arriba
	    int finalNumber = (int) Math.ceil(scaledRandomValue);

	    // Return the random number within the desired range
	    return finalNumber;
	}
}
