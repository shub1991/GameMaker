/**
 * 
 */
package game.controller;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import game.modal.CommandSprite;
import game.modal.Constants;
import game.view.GameView;

/**
 * @author shubham control the command sprite view read user input and when
 *         event occurs it will update the value and ask view to draw it
 *
 */
public class CommandCtrl {
	GameView view;
	CommandSprite sprite;
	int location_X;
	int location_Y;

	public CommandCtrl(GameView view, CommandSprite sprite) {
		super();
		this.view = view;
		this.sprite = sprite;
	}

	public void play() {

		view.setCommandSpriteImage(sprite.getSpriteImage());
		view.setCommandLocation_X(sprite.getLocation_X());
		view.setCommandLocation_Y(sprite.getLocation_Y());
		view.setCommandHeight(sprite.getHeight());
		view.setCommandWidth(sprite.getWidth());

	}
   
    public void move(KeyEvent keyEvent) {
    	
    	
    	 int keyCode = keyEvent.getKeyCode();
    	    switch( keyCode ) { 
    	        case KeyEvent.VK_UP:
    	        	location_Y = sprite.getLocation_Y()-Constants.MOVEMENT_CMD_Y;
    	            sprite.setLocation_Y(location_Y);
    	            play();
    	            break;
    	        case KeyEvent.VK_DOWN:
    	        	location_Y = sprite.getLocation_Y()+Constants.MOVEMENT_CMD_Y;
    	            sprite.setLocation_Y(location_Y);
    	            play(); 
    	            break;
    	        case KeyEvent.VK_LEFT:
    	        	location_X = sprite.getLocation_X()-Constants.MOVEMENT_CMD_X;
    	            sprite.setLocation_X(location_X);
    	            play();
    	            break;
    	        case KeyEvent.VK_RIGHT :
    	        	location_X = sprite.getLocation_X()+Constants.MOVEMENT_CMD_X;
    	            sprite.setLocation_X(location_X);
    	            play();
    	            break;
    	     }
    	    
    }
    public Rectangle getBound() {
 	   return new Rectangle(sprite.getLocation_X(), sprite.getLocation_Y(), sprite.getWidth(), sprite.getHeight());
    }
}
