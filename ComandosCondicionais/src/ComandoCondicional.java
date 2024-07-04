
public class ComandoCondicional {

	public static void main(String[] args) {

		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("IF NORMAL -- Número 1 é menor que número 2, condição atendida");
		}
		
		
		System.out.println("-------------------------------------------------");

		if (num1 > num2) {
			System.out.println("IF COM ELSE -- Número 1 é maior que número 2, condição atendida");

		} else {
			System.out.println("IF COM ELSE -- Número 1 é menor que número 2, condição não atendida");

		}
		
		
		
		System.out.println("-------------------------------------------------");
		
		// condição composta - situação num1 < num2

		if (num1 > num2) {
			System.out.println("IF CONDIÇÃO COMPOSTA 1 -- Número 1 é maior que número 2");

		} else if (num1 < num2){
			System.out.println("IF CONDIÇÃO COMPOSTA 1 -- Número 1 é menor que número 2");
			
		} else {
			System.out.println("IF CONDIÇÃO COMPOSTA 1 -- Número 1 é igual que número 2");

		}
		
		System.out.println("-------------------------------------------------");
		
		// condição composta - situação num1 < num2
		
		num1 = 10;
		num2 = 10;

		if (num1 > num2) {
			System.out.println("IF CONDIÇÃO COMPOSTA 2 -- Número 1 é maior que número 2");

		} else if (num1 < num2){
			System.out.println("IF CONDIÇÃO COMPOSTA 2 -- Número 1 é menor que número 2");
			
		} else {
			System.out.println("IF CONDIÇÃO COMPOSTA 2 -- Número 1 é igual que número 2");

		}
		
		
		System.out.println("-------------------------------------------------");
		
		// Comando condicional SWITCH
		
		
		char opcao = '2';
		
		switch (opcao) {
		
			case '1': {
				System.out.println("SWITCH -- Chame programa de INCLUSÃO");
				break;
			}
			
			case '2': {
				System.out.println("SWITCH -- Chame programa de ALTERAÇÃO");
				break;
			}
			
			case '3': {
				System.out.println("SWITCH -- Chame programa de EXCLUSÃO");
				break;
			}
			
			case '4': {
				System.out.println("SWITCH -- Chame programa de CONSULTA");
				break;
			}
		
		
		default:
			throw new IllegalArgumentException("Opção inválida:  " +  opcao + "Redigite");
		}
		
	}

}
