
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		
		// testando uma igualdade
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2) {
			System.out.println("Número 1 é Número 2 são iguais");
		}
		
		System.out.println("------------------------------------------");
		
		// testando uma igualdade		
		num1 = 10;
		num2 = 30;
		
		if (num1 != num2) {
			System.out.println("Número 1 é Número 2 são diferentes");
		}
		
		System.out.println("------------------------------------------");
		
		// testando maior		
		num1 = 10;
		num2 = 30;
		
		if (num1 > num2) {
			System.out.println("Número 1 é maior que Número 2");
		} else {
			System.out.println("Número 2 é maior que Número 1");
		}
		
		System.out.println("------------------------------------------");
		
		
		// Operadores lógicos
		// && = E ou AND -- || = OU ou OR 			
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Não satisfaz ambas as opçÕes");
		}
		
		
		num2 = 10;
		
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
		}
		

	}

}
