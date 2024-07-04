
public class Juridica extends Pessoa {
	
	public String cnpj;
	public String inscricaoEstadual;
	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", nome=" + nome
				+ ", situacaoPessoa=" + situacaoPessoa + "]";
	}
		

}
