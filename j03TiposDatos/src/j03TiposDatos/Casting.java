package j03TiposDatos;

public class Casting
{
	public static void main(String[] args)
	{
		/*El orden de la jerarquía depende del tamaño de bits y la precisión. El orden de jerarquía de los datos primitivos de menor a mayor es:
		 * 1.- byte (8 bits)
		 * 2.- short (16 bits)
		 * 3.- int (32 bits)
		 * 4.- long (64 bits)
		 * 5.- float (32 bits)
		 * 6.- double (64 bits)
		 *En Java, las conversiones de tipo, de dato, se llaman type casting. Hay dos tipos principales: implicit casting y explicit casting*/
		//Java convierte automáticamente un tipo más pequeño a uno más grande
		byte varA=67;
		short varB=varA;
		//Se debe especificar manualmente la conversión explicita cuando pasas de un tipo de dato más grande a uno más pequeño
		long numPersonas=12_896;//el guion bajo separa entre números para identificar entre miles los números grandes
		int personasCh46=(int)numPersonas;//Se indica que, se convertira el tipo de dato a int (solo tomará 32 bits de long y los pasará al tipo de dato int
		short calificacion=131;
		byte puntos=(byte)calificacion;
		System.out.println("Valor puntos: "+puntos);//Se imprime -125
		/*En la conversión explicícita, es importante tener en cuenta que, puede haber pérdida de datos si el tipo de destino no puede almacenar toda la información del tipo original*/
		
	}

}
