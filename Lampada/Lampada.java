public class Lampada {	
    private String estado;

    public Lampada() {
        estado = "apagada";	
    }	

    public void acender() {		
        estado = "acesa";	
    }	

    public void apagar() {
        estado = "apagada";	
    }	

    public String getEstado() {		
        return estado;	
    }	

    public static void main(String[] args) {
        Lampada l = new Lampada();		

        System.out.println("Estado: " + l.getEstado());		
        l.acender();		
        System.out.println("Estado: " + l.getEstado());		
        l.acender();		
        System.out.println("Estado: " + l.getEstado());		
        l.apagar();		
        System.out.println("Estado: " + l.getEstado());		
        l.apagar();		
        System.out.println("Estado: " + l.getEstado());	}}