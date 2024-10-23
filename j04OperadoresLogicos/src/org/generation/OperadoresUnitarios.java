package org.generation;

public class OperadoresUnitarios 
{

	public static void main(String[] args) 
	{
		/*Los operadores unarios requieren un solo operando:
		 * +		Unary plus operator; indicates positive value (numbers are positive without this, however)
		  -		Unary minus operator; negates an expression
		  ++	Increment operator; increments a value by 1
		  --	Decrement operator; decrements a value by 1
		  !		Logical complement operator; inverts the value of a boolean*/
		int valueA=-10;//El valor es -10
		int valueB=+20;//Por default, los valores son positivos
		int valorInicial=10;
		System.out.println("Preincremento: "+ ++valorInicial);
		System.out.println("Postincremento: "+valorInicial++);
		System.out.println("Valor final: "+ valorInicial);
		
		valorInicial=50;
		System.out.println("Predecremento: "+ --valorInicial);
		System.out.println("Postdecremento: "+valorInicial--);
		System.out.println("Valor final: "+ valorInicial);
	}

}
