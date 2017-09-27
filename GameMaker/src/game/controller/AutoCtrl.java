package game.controller;
/**
 * @author shubham
 * control the Auto sprite 
 * will continue to ask view to draw the updated value
 *
 */

import java.awt.Rectangle;

import game.modal.AutoSprite;
import game.modal.Constants;
import game.view.GameView;

public class AutoCtrl{
	GameView view;
	AutoSprite sprite;
	int location_X;
	int location_Y;

	public AutoCtrl(GameView view, AutoSprite sprite) {
		super();
		this.view = view;
		this.sprite = sprite;
	}

	public void play() {
		
			view.setAutoSpriteImage(sprite.getSpriteImage());
			view.setAutoLocation_X(sprite.getLocation_X());
			view.setAutoLocation_Y(sprite.getLocation_Y());
			view.setAutoHeight(sprite.getHeight());
			view.setAutoWidth(sprite.getWidth());
			
		
	}
	
   public void move(){
	 
	   
	   location_X = sprite.getLocation_X()+Constants.MOVEMENT_AUTO_X;
	   sprite.setLocation_X(location_X);
	   location_Y = sprite.getLocation_Y()+Constants.MOVEMENT_AUTO_Y;
	   sprite.setLocation_Y(location_Y); 
	   play();
	   view.repaint();
	   
   }
   
   public void collision()
   {
	   Constants.MOVEMENT_AUTO_X = - Constants.MOVEMENT_AUTO_X;
	   Constants.MOVEMENT_AUTO_Y = - Constants.MOVEMENT_AUTO_Y;
   }
   
   public Rectangle getBound() {
	   return new Rectangle(sprite.getLocation_X(), sprite.getLocation_Y(), sprite.getWidth(), sprite.getHeight());
   }
	
}
