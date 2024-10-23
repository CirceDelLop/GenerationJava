package org.generation;

public class Operadores
{

	public static void main(String[] args)
	{
		/*Operadores aritmeticos: + (suma),- (resta),*(multiplicación),/(división),%(modulo). Cuando se realizan operaciones entre tipo de datos diferentes, el resultado es promovido al de mayor jerarquía para evitar pérdida de precisión. Ej. int*long=long
		 * 1.- byte (8 bits)
		 * 2.- short (16 bits)
		 * 3.- int (32 bits)
		 * 4.- long (64 bits)
		 * 5.- float (32 bits)
		 * 6.- double (64 bits)*/
		int opA=(int)5.2;
		int opB=6;
		int suma=opA+opB;
		System.out.println(suma);//Imprime 11
		int resta=opA-opB;
		System.out.println(resta);//Imprime -1
		int multiplica=opA*(int)1.2;
		System.out.println(multiplica);//Imprime 5
		int multiplica2=(int)(opA*1.2);
		System.out.println(multiplica2);//Imprime 5
		double multiDouble=opA*1.2;//6.0
		System.out.println(multiDouble);
		int division=opA/opB;
		System.out.println(division);//0
		double divisionDouble=(double)opA/opB;
		System.out.println(divisionDouble);//0.86
		/*Java tiene varios tipos de datos númericos para optimizar el uso de memoria y mejorar el rendimiento, ofreciendo frexibiidad para elegir el tipo adecuado, según el contexto a las necesidades del programa.
		 * En ciclos o en bloques de código dónde se realizan muchas operaciones repetitivas, como iteraciones, es recomendable usar tipos de datos como int, para evitar conversiones innecesarias entre tipos de datos, y así merorar el rendimiento*/
byte interes = 10;
		
		for (int i = 0; i < 1000; i++) {
			short resultado = (short)(50 * interes);			

		}
		int interes2 = 10;
		
		for (int i = 0; i < 1000; i++) {
			int resultado = 50 * interes2;
	}

	}}
