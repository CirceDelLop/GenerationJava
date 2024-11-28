package org.generation.shapes;

public class SquareTest
{
	public static void main(String[] args)
	{
		Square cuadrito=new Square("Cuadrito",4);
		//TwoDimensionalShape cuadrito=new Square("Cuadrito",4);
		//Shape cuadrito=new Square("Cuadrito",4);
		
		System.out.println("Area: "+cuadrito.getArea());
		System.out.println("Perimetro: "+cuadrito.getPerimeter());
		cuadrito.draw();
		System.out.println(cuadrito.printResultArea());
		
		Shape cuadro2=new Square("Cuadro2",50);
		System.out.println(cuadro2.getArea());
		
		if(cuadro2 instanceof Square)
		{
			//Down Casting
			System.out.println(((Square) cuadro2).getPerimeter());
		}
	}

}
