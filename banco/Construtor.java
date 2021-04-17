package banco;

// Se toda conta precisa de	um titular,	como obrigar todos os objetos que forem
// criados a ter um valor desse tipo? Basta criar um único construtor que recebe	essa
// String!

public class Construtor {
	String titular;
	int	numero;
	double saldo;
	
	//	construtor
	Construtor (String titular)	{
	//Faz	mais uma série	de	inicializações	e	configurações
		this.titular	=	titular;
	}
	Construtor (int	numero,	String	titular) {
		this(titular);	
		// Chama o construtor que foi declarado	acima
		this.numero	= numero;
	}
}
