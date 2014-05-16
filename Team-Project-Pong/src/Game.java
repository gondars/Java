import java.awt.BorderLayout;
import java.awt.BufferCapabilities;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderableImage;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;


public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	
	public static PlayerPaddle player; // loading player1 paddle
	InputHandler IH ;
	public static Player2Paddle player2; // loading player2 paddle
    public static Ball ball;
	
	
	JFrame frame; // window of the game
	public final int WIDTH = 400; // window width
	public final int HEIGHT = WIDTH / 16 * 9; // window height
	public final Dimension gameSize = new Dimension(WIDTH,HEIGHT); // merges height and width of the window into a single variable
	public final String TITLE = "World of Pong : Wrath of the SoftUni"; // adding the name of the game
		
	
	BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB); // setting up the image
	
	
	public static boolean gameRunning; // checking if game is running
	
	int p1Score , p2Score; // creating scores
	
	public void run(){
		requestFocus(); // doesn't need to click on game to run it
		
		while(gameRunning){ // if gameRunning==true
			tick();
			render();
			
			try {				
				Thread.sleep(7); // render speed
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public synchronized void start(){ // starting the game
		gameRunning = true;
		new Thread(this).start();
	}
	
	public synchronized void stop(){ // stopping the game
		gameRunning = false;
		System.exit(0);
	}
	
	public Game(){
		frame = new JFrame(); // creating the frame of the game
		
		//Setting the prefered size
		setMinimumSize(gameSize);
		setPreferredSize(gameSize);
		setMaximumSize(gameSize);
			
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		//setting frame defaults
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle(TITLE);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		
		
		
		IH = new InputHandler(this);		//setting up the inputhandler
		
		
		player = new PlayerPaddle(10, 60);	// adding paddles to p1 and p2
		player2 = new Player2Paddle(390, 60);
		ball = new Ball(getWidth() / 2, getHeight() /2);
		
		
			
		
	}
	
	public void tick(){ // this is the tick counter
		player.tick(this);
		player2.tick(this);
		ball.tick(this);
		
	}
	public void render(){
		
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3); // buffers 3 times and reduces tearing
			return;							
		}
		
		Graphics g = bs.getDrawGraphics(); // creating graphics
				
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		
		g.setColor(Color.WHITE); // score color
		
		//drawing scores
		g.drawString("Player 1: " + p1Score , 5 , 10);
		g.drawString("Player 2: " + p2Score , getWidth() -60 , 10);
		
		player.render(g);
		player2.render(g);
		ball.render(g);
		
		g.dispose();
		bs.show();
			
		
		
		
	}
	
	public static void main(String[] args){
		Game game = new Game();		
		game.start();
	}
	

	

}
