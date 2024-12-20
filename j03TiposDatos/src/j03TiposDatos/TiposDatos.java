package j03TiposDatos;

public class TiposDatos 
{

	public static void main(String[] args) 
	{
		//Comentario de línea
		/*REGLAS PARA NOMBRAR VARIABLES
		 * -Se distingue entre minúsculas y mayúsculas.
		 * -Lalongitud del nombre es ilimitada
		 * -Se puede usar cualquier carácter Unicode
		 * -La variable puede comenzar:
		 *  >Una letra ejemplo
		 *  >Signo de dolar $ejemplo (no se recomienda)
		 *  >Carácter de subrayado _ejemplo (no se recomienda)*/
		int $myVar; //Es válido, pero no se recomienda
		int _numEngranes;//Es válido, pero no se recomienda
		int myVarEnEspeñol;//Es válido, pero se recomienda nombres en inglés
		int sinC0m3nt4r10s;//Es válido, pero no se recomienda ya que es confuso
		//int 5mentarios;//No es válido
		boolean isOpenDoor5;//Es válido
		/*En Java tendremos  los siguientes tipo de variables:
		 * -Variables de instancia (Non static fields): atributos de los objetos.
		 * -Variables de clase (Static Fields): atributos de la clase.
		 * -Variables locales (local variables): variable dentro de las funciones(métodos)
		 * -Parámetros (parameters): Entrada de las funciones*/
		/*https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html Tipos de datos en Java
		 *-Objetos
		 *-Datos primitivos 8 datos primitivos
		 *  >byte
		 *  >shorte
		 *  >int
		 *  >long
		 *  >float
		 *  >double
		 *  >boolean
		 *  >char*/
		//El tipo byte es de 8 bits, almacena datos numéricos enteros
		byte myVarByte;///Declarando variable de tipo byte
		myVarByte=12;//Asignando el valor 12 a la variable
		
		/*El número de digitos que puede contener una variable de tipo byte:2^8=256; del -128<--0-->127
		 * Para obtener el valor máxio y mínimo del tipo de dato byte, se usa su wrapper (clase envolvente) Byte*/ 
		System.out.println("Valor máximo de datos del tipo byte: "+Byte.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo byte: "+Byte.MIN_VALUE);
		/*Tipo de dato "short": Dato de de 16 bits, almacena valores enteros (2^16=65,536) del -32,768<--0-->32,767
		 * Para obtener el valor máxio y mínimo del tipo de dato byte, se usa su wrapper (clase envolvente) Short*/
		short myVarShort=12742;//Se declara una variable de tipo short con un valor asignado
		System.out.println("Valor máximo de datos del tipo short: "+Short.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo short: "+Short.MIN_VALUE);
		/*Tipo de dato int: Dato de 32 bits, almacena datos enteros (2^32=4,294,967,296; del -2,147,483,648<--0-->2,147,483,647)
		 *Se usa su wrapper Interger para obtener sus valores mínimo y máximo.*/
		int numero;
		System.out.println("Valor máximo de datos del tipo int: "+Integer.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo int: "+Integer.MIN_VALUE);
		/*Tipo de dato long: Dato de 64bits que almacena datos enteros (2^64=4,294,967,296; del -9,223,372,036,854,775,808<--0-->9,223,372,036,854,775,807)
		 * Su wrapper es Long*/
		System.out.println("Valor máximo de datos del tipo long: "+Long.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo long: "+Long.MIN_VALUE);
		
		/*Las literales númericas enteras en java son de tipo int, ej. 12, -456, 0; Para indicar una literal numérica de tipo long hay que indicar la letra l o L. Se recomienda usar la L para no confundir con el número uno*/
		long myVarLong=2_147_483_648L;
		//short edad=67L;//No se pueden almacenar 64 bits en una variable de 16bits
		/*Tipo de dato float: Dato de 32 bits, almacena valores númericos de punto flotante (con punto decimal)(a.4E-45<--0-->3.4028235E38)
		 * Su wrapper es Float*/
		System.out.println("Valor máximo de datos del tipo flotante: "+Float.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo flotante: "+Float.MIN_VALUE);
		
		/*Tipo de dato double: Dato de 64 bits, almacena valores númericos de punto flotante
		 * Su wrappes es Double*/
		System.out.println("Valor máximo de datos del tipo Double: "+Double.MAX_VALUE);
		System.out.println("Valor mínimo de datos del tipo Double: "+Double.MIN_VALUE);
		 /*Las literales de punto flotante son por default double(64) ej. 123.567, 0.012, -0.989*/
		float myVarFloat=1.23F;
		
		/*Tipo de dato boolean: Almacena solo dos valores posibles true/false*/
		boolean myVarBollean=true;
		
		/*Tipo de dato char: Almacena un solo carácter de la tabla unicode (16 bits). Se debe definir la literal con apóstrofe, ej. 'a', 'b',' '. Puede almacenar del 0 al 65535*/
		//Almacenando el valor unicode en hexadecimal '\\u ValorHexadecimal'
		char primerLetraEnFernandaUnicode='\u0046';//F
		System.out.println(primerLetraEnFernandaUnicode);
		//Alamacenando el valor en númerico
		char letraF=70;
		System.out.println(letraF);
		//Formas de representar un número
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 ); // 34
		System.out.println("Representación binaria: " + 0b0010_0010 ); // 34
		System.out.println("Representación octal: " + 042 ); // 34
		
		/*Tipo de dato string: Es un objeto que se define con comillas dobles. Si se desea imprimir comillar dobles, se usa el caŕacter de escape:
		 * \b backspace
		 * \t tab
		 * \n salto de línea
		 * \r carriage return
		 * \" comilla doble
		 * \' comilla simple
		 * \\ diagonal invertida*/
		String despedida="Java \"Monos\"\na\n\tComer";
		System.out.println(despedida);
	}

}
