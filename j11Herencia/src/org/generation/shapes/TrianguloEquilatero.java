package org.generation.shapes;

public class TrianguloEquilatero extends TwoDimensionalShape
{
	public TrianguloEquilatero(String name,double widht,double height)
	{
		super(name,widht,height);
	}
	
	@Override
	public double getPerimeter()
	{
		return super.getWidth()*3;
	}

	@Override
	public double getArea()
	{
		return (super.getWidth()*super.getHeight())/2;
	}
}