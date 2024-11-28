package com.santander;

public class Atm
{
	/**Clase: Una clase es una componente fundamental de la programación orientada a objeto(OOP: Object oriented Programming). Una clase es una plantilla que define el comportamiento(métodos) y las propiedades(atributos) de los objetos que se crean(instancian) a partir de ella. Una clase puede considerarse como un plano o un molde a partir del cual se crean los objetos( instanciar la clase).*/
/* Atributo de instancia (non-static fileds): Variables que pertenecen a cada instancia (u objeto) de una clase. Esto significa que cada objeto creado a partir de la clase tiene su propia copia de estos atributos, por lo que pueden tener valores diferentes en cada instancia.*/
	int serialNumber;
	String model;
	double balance;
	
	/* Atributos de clase (static fields): Atributos que pertenecen a la clase. Esto significa que tendrá el mismo valor para todos los objetos. Estos atributos son útiles para mantener información común en todos los objetos. También, para propiedades donde no se requiere crear objetos.*/
	static String bankName;
	
	//Métodos contructores
	/*Métodos de instacia (non-static methods)
	 * Sintaxis
	 * 	modificadorDeAcceso retorno/void(sin retonrno) nombreMétodo(parámetros)
	 * Son aquellos que pertenecen a una instanci específica de una clase. Estos métodos pueden acceder y modificar los atributos de instancia yson llamados sobre un objeto particular de la clase*/
	double deposit(double amount)
	{
		return balance+=amount;//=>balance=balance+amount
	}
	
	//Método de retiro
	double withdraw(double amount)
	{
		return balance-=amount;//=>balance=balance-amount
	}
	
	/*Métodos de clase (static methods): Método que pertence a la clase en sí, en lugar de a una  instancia especifíca de la clase. Esto significa que se puede llamar al método sin necesidad de creae un objeto de la clase.
	 * Sintaxis
	 * 	static modificadorDeAcceso retorno/void(sin retonrno) nombreMétodo(parámetros)*/
	static String printBankName()
	{
		return "===Bienvenida==="
				+ "\nBanco "+bankName;
	}
}
