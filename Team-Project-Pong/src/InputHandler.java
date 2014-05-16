import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class InputHandler implements KeyListener {

	public InputHandler (Game game){
		game.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == e.VK_UP) {
			Game.player2.goingDown = false;
			Game.player2.goingUp = true;			
		}
		if (keyCode == e.VK_DOWN) {
			Game.player2.goingUp = false;
			Game.player2.goingDown=true;			
		}
		if (keyCode == e.VK_W) {
			Game.player.goingDown = false;
			Game.player.goingUp = true;
		}
		if (keyCode == e.VK_S) {
			Game.player.goingUp = false;
			Game.player.goingDown = true;
		}
		

	}

	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		//player 2 controls
		if (keyCode == e.VK_UP) {
			Game.player2.goingDown = false;
			Game.player2.goingUp = false;
		}
		if (keyCode == e.VK_DOWN) {
			Game.player2.goingDown = false;
			Game.player2.goingUp = false;
		}
		//player 1 controls
		if (keyCode == e.VK_W) {
			Game.player.goingDown = false;
			Game.player.goingUp = false;
		}
		if (keyCode == e.VK_S) {
			Game.player.goingDown = false;
			Game.player.goingUp = false;
		}
		//exit button ingame
		if (keyCode == e.VK_ESCAPE) {
			System.exit(0);
		}
		
	}

	public void keyTyped(KeyEvent e) {
		
	}



}
