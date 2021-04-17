package banco;

public class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.saldo = 1000.0;
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 1500000;
		
		Cliente c = new Cliente();
		minhaConta.titular = c;
		
		//Minha Conta
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
		minhaConta.saca(200);
		System.out.println("Após saque seu saldo atual é: " + minhaConta.saldo);
		
		minhaConta.deposita(500);
		System.out.println("Após depósito seu saldo atual: " + minhaConta.saldo);
		
		boolean consegui = minhaConta.respostaSaque(20);
		if (consegui) {
			System.out.println("Consegui sacar");
			System.out.println("Saldo atual: " + minhaConta.saldo);
		} else {
			System.out.println("Não consegui sacar");
		}
		
		//Meu Sonho
		System.out.println("Saldo atual: " + meuSonho.saldo);
		
		if (minhaConta == meuSonho)	{
			System.out.println("Contas	iguais");
		} else {
			System.out.println("Vá trabalhar mais !");
		}
		
		meuSonho.tranfereSaldo(minhaConta, 1000);
		System.out.println("Após depósito seu saldo atual: " + minhaConta.saldo);
		System.out.println("Após depósito seu saldo atual dos sonhos: " + meuSonho.saldo);
	}
}
