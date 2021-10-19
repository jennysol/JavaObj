/* Introdução: 
    Para ser executado é necessário que tenhamos o método main 
*/

public class HelloWorld {

    public static void main(String params[]) {
        System.out.println("Rodando o Programa !");
        System.out.println(params.length);

        for(int i=0; i < params.length; i++) {
            System.out.println(i + " => " + params[i]);
        }
    }
}

// Compilador Javac -> JDK contém o Javac 
// Executar -> JRE Virtual machine