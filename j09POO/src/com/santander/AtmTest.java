package com.santander;

public class AtmTest 
{
	public static void main(String[] args)
	{
		//Instanciar la clase Atm y asignarlo a una variable
		Atm cajero01=new Atm();
		//Instancias nuevamente la clase Atm y asignarlo a la variable 'cajero02'
		Atm cajero02=new Atm();
		
		//Asignar valores a los atributos de 'cajero01'
		cajero01.serialNumber=1;
		cajero01.model="T-800";
		cajero01.balance=450_000;
		//Asignar valores a los atributos del cajero02
		cajero02.serialNumber=2;
		cajero02.model="T-1000";
		cajero02.balance=600_000;
		
		//Asignar un valor al atributo estatico de la clase Atm
		Atm.bankName="Santander";
		
		//Leer los atributos estáticos
		//System.out.println(cajero01.bankName);
		//System.out.println(cajero02.bankName);
		System.out.println(Atm.bankName);//La manera correcta/recomendable para hacerlo
		
		//Impriimir el balance de cajero01, depositar $50_000, y mostrar el nuevo balance
		System.out.println("Cajero01: $"+cajero01.balance);
		cajero01.deposit(50_000);
		System.out.println("Cajero01: $"+cajero01.balance);
		
		//Realizar lo mismo para el cajero02, con un depósito de $120_000
		System.out.println("Cajero02: $"+cajero02.balance);
		System.out.println("Cajero02: $"+cajero02.deposit(120_000));
		
		//Realizar la implemenación en la clase Atm del método withdraw() para que los cajeros cepten el 'amount' (retiro) se suma a 'balance'. Mostrar el AtmTest el balance antes y despuès del retiro. Cajero01 retiro de $30_000, cajero02 retiro de $70_000
		//Cajero01
		System.out.println("Cajero01: $"+cajero01.balance);
		System.out.println("Cajero01: $"+cajero01.withdraw(30_000));
		//Cajero02
		System.out.println("Cajero02: $"+cajero02.balance);
		System.out.println("Cajero02: $"+cajero02.withdraw(70_000));
		
		//Uso de método estatico
		//System.out.println(cajero01.printBankName());
		//System.out.println(cajero02.printBankName());
		System.out.println(Atm.printBankName());//La manera correcta/recomendable para hacerlo
		//Un atributo de tipo constante se declara con la palabra reservada 'final', y solo estás variables/atributos se pueden nombrar con puras máyusculas
	}
}