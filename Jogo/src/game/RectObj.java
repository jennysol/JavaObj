package game;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

public class RectObj  extends Rectangle{
	
	public Color color;
	
	public RectObj(int x, int y, int width, int height) {
		super(x, y , width, height);
		
		color = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
	}
}
