// Introdução {
//   Uma variável de instancia é uma variável cujo valor é específico ao objeto e não à classe.  
// }


public class Teste {

  String nome = "Jennifer";
  String nomeCompleto = nome + " Soliver";

  public void m2() {
    System.out.println("Método acessando a instancia " + nomeCompleto);
  }

  public Teste() {
    System.out.println("Construtor acessando a instancia " + nome);
  }


  public static void main(String[] args) {
      Teste t = new Teste();
      t.m2();
      t.nome = "Matheus";
      System.out.println(t.nome);
  }

  // Testando escopo com um Construtor

}