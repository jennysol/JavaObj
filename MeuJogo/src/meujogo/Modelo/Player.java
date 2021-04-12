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
			dy = -3;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 3;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = -3;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dy = 3;
		}
	}
	
//	Quando parar de pressionar a tela 
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		if(codigo == KeyEvent.VK_UP) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dy = 0;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
}
