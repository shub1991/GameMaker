/**
 * 
 */
package game.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import game.controller.AutoCtrl;
import game.controller.CommandCtrl;

/**
 * @author shubham it will be the view that will capture movement and request
 *         controller for data to display on screen
 */
@SuppressWarnings("serial")
public class GameView extends Panel {

	// the view need to know where to draw
	private int autoLocation_X;
	private int autoLocation_Y;
	// the view need to know what to draw
	private Image autoSpriteImage;
	// the game need to the height and width of the game object it need to paint
	private int autoHeight;
	private int autoWidth;

	// the view need to know where to draw
	private int commandLocation_X;
	private int commandLocation_Y;
	// the view need to know what to draw
	private Image commandSpriteImage;
	// the game need to the height and width of the game object it need to paint
	private int commandHeight;
	private int commandWidth;

	private AutoCtrl autoCtrl;
	private CommandCtrl commandCtrl;
	
	

	public void setCommandCtrl(CommandCtrl commandCtrl) {
		this.commandCtrl = commandCtrl;
	}

	public void setAutoCtrl(AutoCtrl autoCtrl) {
		this.autoCtrl = autoCtrl;
	}

	// the actual method that will paint the game objects on the screen
	@Override
	public void paint(Graphics g) {

		super.paint(g);
         this.requestFocus();
		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(commandSpriteImage, commandLocation_X, commandLocation_Y, commandWidth, commandHeight, this);
		g2d.drawImage(autoSpriteImage, autoLocation_X, autoLocation_Y, autoWidth, autoHeight, this);
		

	}

	public void display() {
		repaint();
		   ActionListener actionListener = new ActionListener() {
	           
				@Override
				public void actionPerformed(ActionEvent arg0) {
					autoCtrl.move();
					   if(autoCtrl.getBound().intersects(commandCtrl.getBound()))
			            {	
			            	autoCtrl.collision();}
				}
	        };
	        
	        Timer timer = new Timer( 500, actionListener );
	        timer.start();
	        KeyListener keyListener = new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
				  
					
					commandCtrl.move(e);
					
				}
			};
            this.addKeyListener(keyListener);
            
         
	}

	public int getAutoLocation_X() {
		return autoLocation_X;
	}

	public void setAutoLocation_X(int autoLocation_X) {
		this.autoLocation_X = autoLocation_X;
	}

	public int getAutoLocation_Y() {
		return autoLocation_Y;
	}

	public void setAutoLocation_Y(int autoLocation_Y) {
		this.autoLocation_Y = autoLocation_Y;
	}

	public Image getAutoSpriteImage() {
		return autoSpriteImage;
	}

	public void setAutoSpriteImage(Image autoSpriteImage) {
		this.autoSpriteImage = autoSpriteImage;
	}

	public int getAutoHeight() {
		return autoHeight;
	}

	public void setAutoHeight(int autoHeight) {
		this.autoHeight = autoHeight;
	}

	public int getAutoWidth() {
		return autoWidth;
	}

	public void setAutoWidth(int autoWidth) {
		this.autoWidth = autoWidth;
	}

	public int getCommandLocation_X() {
		return commandLocation_X;
	}

	public void setCommandLocation_X(int commandLocation_X) {
		this.commandLocation_X = commandLocation_X;
	}

	public int getCommandLocation_Y() {
		return commandLocation_Y;
	}

	public void setCommandLocation_Y(int commandLocation_Y) {
		this.commandLocation_Y = commandLocation_Y;
	}

	public Image getCommandSpriteImage() {
		return commandSpriteImage;
	}

	public void setCommandSpriteImage(Image commandSpriteImage) {
		this.commandSpriteImage = commandSpriteImage;
	}

	public int getCommandHeight() {
		return commandHeight;
	}

	public void setCommandHeight(int commandHeight) {
		this.commandHeight = commandHeight;
	}

	public int getCommandWidth() {
		return commandWidth;
	}

	public void setCommandWidth(int commandWidth) {
		this.commandWidth = commandWidth;
	}

}
