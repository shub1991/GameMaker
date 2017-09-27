package game.main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import game.controller.AutoCtrl;
import game.controller.CommandCtrl;
import game.modal.AutoSprite;
import game.modal.CommandSprite;
import game.modal.Constants;
import game.view.GameView;


public class Main {

	public static void main(String[] args) {
		
		AutoSprite sprite = new AutoSprite(200, 200,
				new ImageIcon("resources\\img\\ball.png").getImage(),Constants.BALL_HEIGHT ,Constants.BALL_WIDTH,true, true);
		CommandSprite sprite1 = new CommandSprite(200, 400,
				new ImageIcon("resources\\img\\paddle.png").getImage(),Constants.PADDLE_HEIGHT,Constants.PADDLE_WIDTH,true, true,true,true);
		JFrame frame = new JFrame("some title");
		frame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		GameView gameView = new GameView();
		AutoCtrl autoCtrl = new AutoCtrl(gameView, sprite);
		CommandCtrl commandCtrl = new CommandCtrl(gameView, sprite1);
		 commandCtrl.play();
		    autoCtrl.play();
		gameView.setAutoCtrl(autoCtrl);
		gameView.setCommandCtrl(commandCtrl);
		frame.add(gameView);
	

	gameView.display();	
	 
		
        
	}

}
