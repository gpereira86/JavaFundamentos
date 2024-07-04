
public class LacoRepeticao {

	public static void main(String[] args) {
		
		// Comando WHILE - Laço pré testado
		System.out.println("-------------------------------------------------");
		System.out.println("Comando WHILE");
		System.out.println("-------------------------------------------------");		
		
		int qtdVezes = 1;
		
		System.out.println("Exemplo While:");
		
		while (qtdVezes <= 10) {
			
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // qtdVezes = qtdVezes +1
		}
		
		System.out.println("Saí do laço e executei "+ (qtdVezes - 1) + " vezes");
		

		System.out.println("-------------------------------------------------");
		System.out.println("Comando DO WHILE");
		System.out.println("-------------------------------------------------");
	
		// Comando DO WHILE - Laço pós testado
		qtdVezes = 1;
		
		do {
			
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // qtdVezes = qtdVezes +1
			
		} while(qtdVezes <= 10);
		
		
		System.out.println("Saí do laço e executei "+ (qtdVezes - 1) + " vezes");
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Comando FOR");
		System.out.println("-------------------------------------------------");
		
		// Comando FOR
		
		
		qtdVezes = 0;
		
		for (int qtdVezes1 = 0; qtdVezes1 <= 10; qtdVezes1++) {
			
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			qtdVezes = qtdVezes1;
		}
		
		System.out.println("Saí do laço e executei "+ (qtdVezes) + " vezes");
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Quebrando Laços de Repetição");
		System.out.println("-------------------------------------------------");
		
		for (int qtdVezes1 = 0; qtdVezes1 <= 10; qtdVezes1++) {
			
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			
			if(qtdVezes1 == 5) {
				System.out.println("Parei na " + (qtdVezes1) +  "ª vez");
				break;
			}
		
		}
		
		
	}
	

}






