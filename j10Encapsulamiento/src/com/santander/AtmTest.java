package com.santander;

public class AtmTest
{
	public static void main(String[] args)
	{
		Atm cajero01=new Atm();
		//cajero01.balance=40_000;//No se puede acceder a atributos private
		//cajero01.serialNumber=1;
		System.out.println("N. Serie cajero01: "+cajero01.getSerialNumber());
		System.out.println("N. Modelo cajero01: "+cajero01.getModel());
		cajero01.setModel("T-800");
		System.out.println("N. Modelo cajero01: "+cajero01.getModel());
		
		cajero01.setBalance(350_000);
		System.out.println("Balance cajero01: "+cajero01.getBalance());
		System.out.println(cajero01);
		
		//Crear cajero02 con valores, 2, T-1000, 600_000
		Atm cajero02=new Atm();
		//cajero02.setSerialNumber(2);
		cajero02.setModel("T-1000");
		cajero02.setBalance(600_000);
		System.out.println(cajero02);
		
		//Crear cajero03 con valores: modelo: T-800, balance: 200_000
		Atm cajero03=new Atm("T-800",200_000);
		System.out.println(cajero03);
	}

}
