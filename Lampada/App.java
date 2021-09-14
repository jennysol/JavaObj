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
    System.out.println("Estado: " + l.getEstado());	
}