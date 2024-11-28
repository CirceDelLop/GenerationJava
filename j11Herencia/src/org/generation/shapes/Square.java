package org.generation.shapes;

import org.generation.util.Draw;

public class Square extends TwoDimensionalShape implements Draw
{
	public Square(String name,double side)
	{
		super(name,side,side);
	}

	
	@Override
	public double getPerimeter()
	{
		return super.getWidth()*4;
	}

	@Override
	public double getArea()
	{
		return super.getWidth()*super.getHeight();
	}
	
	@Override
	public void draw()
	{
		System.out.println("Soy "+super.getName()+" y me voy a dibujar");
	}
	
	@Override
	public String printResultArea()
	{
		return "EL área de "+super.getName()+" es igual a "+this.getArea();
	}
}
