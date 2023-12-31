package spaceinvaders;

import javax.swing.ImageIcon;

public class GameOver extends Sprite implements Commons  {
	
	private final String gameOver = "img/gameover.png";
	private int width;
	
	public GameOver() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(gameOver));
		
		setWidth(ii.getImage().getWidth(null));
		setImage(ii.getImage());
		setX(0);
		setY(0);
		
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		
	}
	
}
