class People {
    static int id = 1;
    static int x = 0;

    static void method() {
        System.out.println(id);
    }

    int y = 0;
    public void setY(int y) {
        this.y = y;
    }

}

class X {
    int a = 10;

    public void metodo() {
        int a = 20; // shadowing
        System.out.println(a); // print 20
    }
}

public class Static {
    
    public static void main(String[] args) {
        People p = new People();
        People.method();
        System.out.println(p.id);
        System.out.println(p.id);
        System.out.println(People.id);
    }
}