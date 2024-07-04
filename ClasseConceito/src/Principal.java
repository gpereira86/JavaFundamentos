
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa pes = new Pessoa();
		
//		pes.nomePessoa = "João do Nascimento";
//		pes.idadePessoa = 15;
//		
//		pes.mostraDados(pes.nomePessoa, pes.idadePessoa);
		
		pes.setNomePessoa("JOÃO DE NASCIMENTO");
		pes.setIdadePessoa(15);
		
		System.out.println(pes.toString());
		
	}

}
