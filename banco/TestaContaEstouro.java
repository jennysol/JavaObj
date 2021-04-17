package banco;

public class TestaContaEstouro {
	public static void main(String[] args) { 
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		
		// Quero mudar o saldo para	-200
		double novoSaldo = -200;
		
		// Testa se	o novoSaldo	é válido
		if	(novoSaldo < 0)	{	//	
			System.out.println("Não	posso mudar	para saldo negativo");
		} else {
			minhaConta.saldo = novoSaldo;
		}
	}
}
