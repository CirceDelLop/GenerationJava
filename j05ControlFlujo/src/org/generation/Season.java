package org.generation;

import java.util.Scanner;

public class Season
{
	public static void main(String[] args)
	{
		/*Determinar la estación.
		 * 1. Solicitar al usuario que ingrese un mes, como texto.
		 * 2. Determnar la estación del año de acuerdo al mes ingresado
		 * 3. Imprimir la estación corespondiente: Primavera, Verano, Otoño, Invierno
		 *    Donde:
		 *     -Primavera: Marzo, Abril, MAyo
		 *     -Verano: Junio, Julio, Agosto
		 *     -Otoño: Septiembre, Octubre, Noviembre
		 *     -Invierno: Diciembre, Enero, Febrero
		 *Evaluar los meses usando if-else-if y switch*/
		String estacion;
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingresa un mes del año (en texto): ");
		String mes=sc.nextLine().toLowerCase();
		
		if(mes.equalsIgnoreCase("diciembre")||mes.equals("enero")||mes.equals("febrero"))
		{
			System.out.println("La estacón del año durante ese mes es invierno");
		}
		else if(mes.equalsIgnoreCase("marzo")||mes.equals("abril")||mes.equals("mayo"))
		{
			System.out.println("La estacón del año durante ese mes es primavera");
		}
		else if(mes.equalsIgnoreCase("junio")||mes.equals("julio")||mes.equals("agosto"))
		{
			System.out.println("La estacón del año durante ese mes es verano");
		}
		else if(mes.equalsIgnoreCase("septiembre")||mes.equals("octubre")||mes.equals("noviembre"))
		{
			System.out.println("La estacón del año durante ese mes es otoño");
		}
		else
		{
			System.out.println("Mes invalido");
		}
		
		switch(mes)
		{
			case "enero","febrero":
				estacion="invierno";
				break;
			
			case "marzo","abril","mayo":
				estacion="primavera";
				break;
			
			case "junio","julio","agosto":
				estacion="verano";
				break;
			
			case "septiembre","octubre","noviembre":
				estacion="otoño";
				break;
			
			default:
				estacion="invalido";
				break;
		}
		
		if(estacion.equals("invalido"))
		{
			System.out.println("Mes invalido");
		}
		else
		{
			System.out.println("La estacón del año durante ese mes es "+estacion);
		}
	}
}
