package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static int contador = 0;
	public static void main(String[] args) {
		
		//Varíaveis
		short operacao;
        double num1, num2;    
        Scanner input = new Scanner(System.in);
        
        //Loop
        do {
        	 System.out.println("-----------------------------");
	         System.out.println("Digite a Operação Desejada:");
	         System.out.println("  -1 Soma");      
	         System.out.println("  -2 Subtração");      
	         System.out.println("  -3 Multiplicação");      
	         System.out.println("  -4 Divisão");      
	         System.out.println("  -0 Sair");
	         System.out.println("-----------------------------");
	         
	         // Entrada da Operação
	         System.out.print("Operacão: ");
	         operacao = input.nextShort();
             
	         // Sair
             if (operacao == 0) {
            	 System.out.println("Encerrando...");
            	 break;
             }
             
             // Tentativas = 10
             if( Calculadora.contador == 10) {
         		System.out.println("Desisto...");
         		break;
         	 }
             
             // Operação Existe 
             if (!ValidaOperador(operacao)) {
            	 continue;
             }
             
             
             // Entrada dos Valores
             System.out.print("Digite o primeiro valor: ");
             num1 = input.nextDouble();
             
             System.out.print("Digite o segundo valor: ");
             num2 = input.nextDouble();
             
             
             // Validando Valores
             if (!ValidaDadosDeEntrada(operacao, num1, num2)) {
            	 continue;
             }
        
             System.out.println("RESULTADO: O resultado da operação " + getNomeOperacao(operacao) + " é " + Calcular(operacao, num1, num2) + "\n");
        } while (operacao != 0);
    }
    
    static double Calcular (short operacao, double num1, double num2) {
    	double resultado = 0;
    	switch (operacao) {
    		case 1: //soma
    			resultado = num1 + num2;
    			break;
    		case 2: //substração
    			resultado = num1 - num2;
    			break;
    		case 3: //multiplicação
    			resultado = num1 * num2;
    			break;
    		case 4: //divisão
    			resultado = num1 / num2;
    			break;
    	}
    	return resultado;
    }
    
    static boolean ValidaOperador (short operacao) {
       	boolean retorno = true;
       	
    	if (operacao > 4) {
       		System.out.println("ERRO: Operacao escolhida não existe.\n");
       		Calculadora.contador ++;
       		System.out.println("Tentativa " + Calculadora.contador);
       		retorno = false;
       	}
    	return retorno;
    }
    
    static boolean ValidaDadosDeEntrada (short operacao, double num1, double num2) {
    	boolean retorno = true; 
    
    	
    	if (operacao == 4 & num2 == 0) {
        	 System.out.println("ERRO: Divisor não pode ser zero.\n");
        	 retorno = false;
        }
    	return retorno;
    }
    
    static String getNomeOperacao (short operacao) {
    	
    	switch (operacao) {
		case 1:
			return "soma";
		case 2:
			return "subtracao";
		case 3: 
			return "multiplicacao";
		case 4: 
			return "divisao";
    	default:
    		return "undefined";
    	}
    	
    }
	
}
