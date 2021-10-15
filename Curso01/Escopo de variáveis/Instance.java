// Introdução {
//   Uma variável de instancia é uma variável cujo valor é específico ao objeto e não à classe.  
// }


public class Instance {

  String nome = "Jennifer";
  String nomeCompleto = nome + " Soliver";

  public void m2() {
    System.out.println("Método acessando a instancia " + nomeCompleto);
  }

  public Instance() {
    System.out.println("Construtor acessando a instancia " + nome);
  }


  public static void main(String[] args) {
      Instance t = new Instance();
      t.m2();
      t.nome = "Matheus";
      System.out.println(t.nome);
  }

  // Testando escopo com um Construtor

}