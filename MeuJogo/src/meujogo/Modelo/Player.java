package meujogo.Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	
	private int x,y;
	private int dx,dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		this.dx = 100;
		this.dy = 100;
	}
	
	public void Load() {
		ImageIcon referencia = new ImageIcon("res\\carro.png");
		imagem = referencia.getImage();
		
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void Update() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy = 3;
			
		}
	}
}
