// Introdução {
//   Observando escopo de váriáveis locais.
// }

public class Escopo {

    // Testando escopo 


    public void m2() {
    }

    public Escopo(String nome) {
        System.out.println(nome);
        m2();
        System.out.println(nome);
    }


    public static void main(String[] args) {
        Escopo t = new Escopo("jennifer");
    }

    // Testando escopo com um Construtor

}