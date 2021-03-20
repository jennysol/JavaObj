import java.util.Scanner;

class Desafio {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);

        int num = 0;

        while(num < 1 || num > 10) {
            System.out.print("Números: ");
            num = ler.nextInt();
        }

        for(int i=num; i<101 ; i++) {

            if(i %15 == 0) {
                System.out.println("M15");
            } else {
                if(i %10 == 0) {
                    System.out.println("M10");
                } else {
                    if(i %5 == 0) {
                        System.out.println("M5");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
        ler.close();
    }
}