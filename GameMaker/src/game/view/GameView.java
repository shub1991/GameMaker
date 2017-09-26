/**
 * 
 */
package game.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;

/**
 * @author shubham
 *it will be the view that will capture movement and request controller for data to display on screen
 */
@SuppressWarnings("serial")
public class GameView extends Panel {
    
	//the view need to know where to draw
	private int location_X;
	private int location_Y;
	//the view need to know what to draw
	private Image spriteImage;
	//the game need to the height and width of the game object it need to paint
	private int height;
	private int width;

	//the actual method that will paint the game objects on the screen
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(spriteImage, location_X,location_Y ,width,height,this);
	}
}
