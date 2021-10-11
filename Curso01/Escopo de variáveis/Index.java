
public class Teste {
    public void m1() {
        int x = 10;

        if( x >= 10) {
            int y = 50; 
            System.out.println("Só existo dentro deste bloco "+ y);
        }

        // for(int i=0, j=0; i<=10; i++) j++;{
        //     System.out.println('Só consigo acessar i e j dentro do bloco for'i);
        //     System.out.println(j);
        // }

        System.out.println(x);
    }

    public void m2(String nome) {
        System.out.println(nome);
    }

    public void m3() {
        // Não posso acessar (nome)
        System.out.println(nome);
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.m1();
        t.m2("Jennifer");
        // t.m3();
    }
}