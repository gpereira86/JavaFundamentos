
public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Pessoa pes = new Pessoa();
		
//		pes.nome = "JOÃO";
//		pes.cpf = "11111111111";
//		pes.identidade = "1560455";
//		pes.situacaoPessoa = "A";
//		
//		pes.cnpj = "212121212121";
//		pes.nome = "CASAS DO SILVA";
//		pes.inscricaoEstadual = "65454654";
//		pes.situacaoPessoa = "I";
		
		Fisica fis =  new Fisica();
		
		fis.nome = "JOÃO";
		fis.cpf = "11111111111";
		fis.identidade = "1560455";
		fis.situacaoPessoa = "A";
		
		
		Juridica jur =  new Juridica();
		
		jur.cnpj = "212121212121";
		jur.nome = "CASAS DO SILVA";
		jur.inscricaoEstadual = "65454654";
		jur.situacaoPessoa = "I";
		
		
		System.out.println("Dados da Pessoa Física ");
		System.out.println(fis.toString());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Dados da Pessoa Jurídica ");
		System.out.println(jur.toString());
		
				
	}

}
