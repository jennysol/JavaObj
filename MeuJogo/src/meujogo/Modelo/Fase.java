package meujogo.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
package meujogo.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener {
	
	private Image fundo;
	private Player player;
	
	
	public Fase() {
		ImageIcon referencia = new ImageIcon("res\\fundo.png");
		fundo = referencia.getImage();
		
		player = new Player();
		player.Load();
	}
	
	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		player.Update();
		repaint();
		
	}
}