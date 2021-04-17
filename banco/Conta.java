package banco;

public class Conta {
	//Atributos
	int numero;
	Cliente titular; //String é uma classe em Java. Ela guarda uma cadeia de caracteres.
	double saldo; //private depois para maior segurança
	
//	methods
	
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean respostaSaque(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	
	boolean tranfereSaldo(Conta destino, double valor) {
		boolean retirou = this.respostaSaque(valor);
		if(retirou == false) {
			// Saldo insuficiente !
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}
	
}
