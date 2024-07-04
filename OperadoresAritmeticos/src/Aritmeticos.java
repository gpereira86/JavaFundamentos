
public class Aritmeticos {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		// Soma
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		
		System.out.println("O resultado da Soma é: " + num3);
		
		// Subtração
		num1 = 10;
		num2 = 20;
		num3 = num1 - num2;
		
		System.out.println("O resultado da Subtração é: " + num3);
		
		
		// Multiplicação
		num1 = 10;
		num2 = 20;
		num3 = num1 * num2;
		
		System.out.println("O resultado da Multiplicação é: " + num3);
		
		// Divisão
		num1 = 20;
		num2 = 2;
		num3 = num1 / num2;
		
		System.out.println("O resultado da Divisão é: " + num3);
	
		
		System.out.println("------------------------------");
		// Incrementando (somando de 1 em 1)
		num1=0;
		while (num1 <= 9) {
			num1++; 
			System.out.println(num1);
			
		}
		
		System.out.println("------------------------------");
		// Decrementando (subtraindo de 1 em 1)
		num1=10;
		while (num1 >= 1) {
			System.out.println(num1);
			num1--; 			
		}

	
	
	}

}
