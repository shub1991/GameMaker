package game.controller;
/**
 * @author shubham
 * control the Auto sprite 
 * will continue to ask view to draw the updated value
 *
 */

import game.modal.AutoSprite;
import game.view.GameView;

public class AutoCtrl{
	GameView view;
	AutoSprite sprite;

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
 
	
}
