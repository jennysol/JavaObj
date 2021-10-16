/* 
    Introdução:
        Observando escopo de váriáveis locais.
*/

public class Scope {

    // Testando Scope 


    public void m2() {
    }

    public Scope(String name) {
        System.out.println(name);
        m2();
        System.out.println(name);
    }


    public static void main(String[] args) {
        Scope t = new Scope("jennifer");
    }

    // Testando escopo com um Construtor

}