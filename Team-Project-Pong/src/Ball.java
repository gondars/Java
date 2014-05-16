import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	int x,y; // setting up the ball
	int size = 16;
	int speed = 3;	
	int vx , vy;
	
	Rectangle boundingBox; // ball collision
	

	public Ball(int x,int y){
		this.x = x;
		this.y = y;
		
		//giving the ball velocity
		vx = speed;
		vy = speed;
		
		boundingBox = new Rectangle(x , y , size , size); // collision box
		boundingBox.setBounds(x , y , size , size);
	}
	
	public void tick(Game game){
		boundingBox.setBounds(x , y , size , size);
		
		if (x <= 0) { // player2 score counter
			game.p2Score++;
			vx = speed;
		}else if (x + size >= game.getWidth()) {
			game.p1Score++; // player1 score counter
			vx = -speed;
		}
		if (y <= 0) { // ball movements
			vy = speed;
		}else if (y+ + size >= game.getHeight()) {
			vy = -speed;
		}
		
		x += vx;
		y += vy;
		
		paddleCollide(game);
	}
	
	private void paddleCollide(Game game){ // giving the collision a meaning
		if (boundingBox.intersects(Game.player.boundingBox)) {
			vx = speed;
		}else if (boundingBox.intersects(Game.player2.boundingBox)) {
			vx = -speed;
		}
	}
		
	public void render(Graphics g){ // giving the ball graphics
		g.setColor(Color.RED);
		g.fillOval(x, y, size, size);
	}
}
