package org.generation;

class Iteration
{
	private String name;
	
	public Iteration(String name)
	{
		this.name = name;
	}
	
	public void iterationNumber(int number)
	{
		for (int i = 0; i < number; i++) {
			System.out.println("Obj: " + this.name + ", iteration n: " + i);			
		}
	}
} // Iteration

class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
	}
	
	//Método que será concurrente
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("id: "+super.getId()+", name: "+super.getName()+", iteration n: "+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			} 
		}
	}
}

public class ThreadUsingExtends
{
	public static void main(String[] args)
	{
		//Programación secuencial
		Iteration it01 = new Iteration("Iteración 01");
		Iteration it02 = new Iteration("Iteración 02");
		Iteration it03 = new Iteration("Iteración 03");
		
		//it01.iterationNumber(5);
		//it02.iterationNumber(5);
		//it03.iterationNumber(5);
		
		//Realizar concurrencias
		MyThread hilo01=new MyThread("hilo01");
		MyThread hilo02=new MyThread("hilo02");
		MyThread hilo03=new MyThread("hilo03");
		
		//Ejecutar concurrencias
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
		System.out.println("Hilo01 esAlive: "+hilo01.isAlive());
		System.out.println("Hilo02 esAlive: "+hilo02.isAlive());
		System.out.println("Hilo03 esAlive: "+hilo03.isAlive());
		
		try
		{
			hilo01.join();
			hilo02.join();
			hilo03.join();
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
