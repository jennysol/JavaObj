package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Criando {
	public static void main(String[] args) {
		Conta criando;
		criando = new Conta();
		
		ArrayList<Conta> contas = new ArrayList<>();
        
		Scanner ler = new Scanner(System.in); 
		
      //---------------------------
		System.out.println("Informe o nome do titular: ");
        criando.titular = ler.nextLine();
        
        System.out.println("Informe o saldo inicial: ");
        criando.saldo = ler.nextDouble();
        
        System.out.println("Informe o número: ");
        criando.numero = ler.nextInt();
		
	}
}
