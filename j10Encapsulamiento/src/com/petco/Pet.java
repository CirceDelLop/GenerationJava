package com.petco;

class Dog
{
	String name="Solovino";
	int serialNumber;
	static int counter=1;
	
	//Bloque de inicialización de atributos non-static
	{
		this.name="Firulais";
		this.serialNumber=++counter;
	}
	
	static//Bloque de inicialización de atributos static
	{
		counter=100;
	}
	//Constructores
	Dog()
	{
		
	}
	
	Dog(String name)
	{
		this.name=name;
	}
	
	Dog(String name,int age)
	{
		this(name);
		age++;
	}
}

public class Pet
{
	public static void main(String[] args)
	{
		Dog tessa=new Dog("Tessa");
		System.out.println(tessa.name);
		
		Dog chocolate=new Dog();
		System.out.println(chocolate.name);
		
		Dog locky=new Dog("Rocky",9);
		System.out.println(locky.name);
	}
}
