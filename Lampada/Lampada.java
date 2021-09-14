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

}