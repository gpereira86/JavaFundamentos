
public class Polimorfismo {

	public static void main(String[] args) {
				
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de leite de um elefante: " + mamifero1.cotaDiariaLeita());
		
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária de leite de um rato: " + mamifero2.cotaDiariaLeita());
		
		
	}

}
