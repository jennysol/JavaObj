package banco;

public class Cliente {
	String nome;
	String sobrenome;
	private String cpf;
	private int nascimento;
	
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf) {
		// Validações
		
	}
}
