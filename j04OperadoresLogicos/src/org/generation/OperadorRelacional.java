package org.generation;

public class OperadorRelacional
{

	public static void main(String[] args)
	{
		/*Operadores de igualdad, relacionales y condicionales
		 * == igual que
		 * != diferente de
		 * < menor que
		 * >= mayor o igual que
		 * > mayor que
		 * <= menor o igual que*/
		int value1=1,value2=2;
		
		if(value1 == value2)//La igualdad solo se aplica para datos primitivos
            System.out.println("value1 == value2"); // No se imprime
        
        if(value1 != value2)
            System.out.println("value1 != value2"); // imprime
        
        if(value1 > value2)
            System.out.println("value1 > value2"); // No se imprime
        
        if(value1 < value2)
            System.out.println("value1 < value2"); //  Se imprime
        
        if(value1 <= value2)
            System.out.println("value1 <= value2"); // Se imprime
        
        //if(value1<="10")No se puede realizar la comparación
        String valor="10";
        byte valorAByte=Byte.parseByte(valor);//Convierte un string a byte
        short valorAShort=Short.parseShort(valor);//Convierte un string a short
        int valorAInt=Integer.parseInt(valor);//Convierte un string a int
        long valorALong=Long.parseLong(valor);//Convierte un string a long
        float valorAFloat=Float.parseFloat(valor);//Convierte un string a float
        double valorADouble=Double.parseDouble(valor);//Convierte un string a double
        
        if(value1>=valorAShort)
        	System.out.println("Valor menor");
	}

}
