package com.petco;

import java.util.ArrayList;

public class CatTest
{
	public static void main(String[] args)
	{
		Cat gato1=new Cat();
		gato1.ingresarInfo();
		
		//Poner 4 gatos en una colección ArrayList
		//Se tiene una guardería de gatos
		ArrayList<Cat> losPintitos=new ArrayList<>();
		
		Cat gato2=new Cat();
		gato2.ingresarInfo();
		
		Cat gato3=new Cat();
		gato3.ingresarInfo();
		
		losPintitos.add(gato1);
		losPintitos.add(gato2);
		losPintitos.add(gato3);
		
		Dog tessa=new Dog();
		//losPintitos.add( tessa );// La colección está definida para almacenar
		// objetos de tipo Cat, tessa es de tipo Dog
		
		//Mostrar en consola los gatos que su posrción sea mayor o igual a 3
		for(Cat gato:losPintitos)
		{
			if(gato.edad>=3)
			{
				System.out.println(gato);
			}
		}
	}

}
