package game;

import java.awt.Canvas;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	
	//Método Construtor
	public Game() {
		Dimension dimension = new Dimension(640, 480);
		this.setPreferredSize(dimension);
	}
	
	// Método de Atualização
	public void update() {
		
	}
	
	//Método para Renderização
	public void render() {
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame jframe = new JFrame("Meu jogo");
		
		//Limitar tamanho da Janela 
		jframe.add(game);
		
		jframe.setLocationRelativeTo(null);
		jframe.pack();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setVisible(true);
	}
	
	@Override
	public void run() {
		
		//Implementando Loop
		while(true) {
			
			//métodos
			update();
			render();
			
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}
