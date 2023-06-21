package spaceinvaders;

import javax.swing.ImageIcon;

public class Won extends Sprite implements Commons {
	
	private final String won = "/img/won.jpg";
	private int width;
	
	public Won() {
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(won));
		width  = ii.getImage().getWidth(null);
		
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
