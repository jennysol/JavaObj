import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Test");

        int idade;
        char sexo;
        float altura;
        double dna;
        String nome;

        idade = 10;
        sexo = 'f';
        altura = 1.80f;
        dna = 4.673254678;
        nome = "Banana";

        // System.out.println(idade);
        System.out.println("Idade informada: " + idade);
        System.out.println("Sexo informada: " + sexo);
        System.out.println("Altura informada: " + altura);
        System.out.println(" informada: " + dna);
        System.out.println("Idade informada: " + nome);

        Scanner ler = new Scanner(System.in);

        idade = ler.nextInt();
        System.out.print("Informe a nova idade: ");
        idade = ler.nextInt();
        System.out.println("Nova idade informada: " + idade);

        // Somente uma vez 
        ler.close();

    }
}