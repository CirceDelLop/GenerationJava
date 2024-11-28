package org.generation.shapes;

public class TrianguloEquilateroTest
{
	public static void main(String[] args)
	{
		/*Generar la clase concreta de trìangulo
		 * -Calcular el àrea y perìmetro
		 * -Hacer las pruebas*/
		TrianguloEquilatero triangulo=new TrianguloEquilatero("Triangulo",4,6);
		
		System.out.println("Area: "+triangulo.getArea());
		System.out.println("Perimetro: "+triangulo.getPerimeter());
		System.out.println("Lado: "+triangulo.getWidth());
		
		
	}

}
