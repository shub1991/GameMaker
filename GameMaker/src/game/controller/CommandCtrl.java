/**
 * 
 */
package game.controller;

import game.modal.CommandSprite;
import game.view.GameView;

/**
 * @author shubham control the command sprite view read user input and when
 *         event occurs it will update the value and ask view to draw it
 *
 */
public class CommandCtrl {
	GameView view;
	CommandSprite sprite;

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

}
