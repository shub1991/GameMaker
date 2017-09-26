package game.modal;

import java.awt.Image;

/**
 * @author shubham sprite for the game objects that going move themselves
 *         without gamer's involvement It should allow the user the choice how
 *         they want want it to move
 */
public class AutoSprite extends Sprite {
	private boolean horizontalMove;
	private boolean verticalMove;

	public AutoSprite(int location_X, int location_Y, Image spriteImage, int height, int width, boolean horizontalMove,
			boolean verticalMove) {
		super(location_X, location_Y, spriteImage, height, width);
		this.horizontalMove = horizontalMove;
		this.verticalMove = verticalMove;
	}

	public boolean isHorizontalMove() {
		return horizontalMove;
	}

	public void setHorizontalMove(boolean horizontalMove) {
		this.horizontalMove = horizontalMove;
	}

	public boolean isVerticalMove() {
		return verticalMove;
	}

	public void setVerticalMove(boolean verticalMove) {
		this.verticalMove = verticalMove;
	}
}
