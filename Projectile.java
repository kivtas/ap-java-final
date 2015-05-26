import processing.core.PApplet;
import processing.core.PVector;
public class Projectile {
	float x;
	float y;
	float initialVelocity;
	float angle;
	float xVelocity;
	float yVelocity;
	float gravity = (float) 0.25;
	
	
	
	public Projectile(float initialVelocity, float angle, float x, float y){
		this.initialVelocity = initialVelocity;
		this.angle = angle;
		xVelocity = (float) (initialVelocity*Math.cos(Math.toRadians(angle)));
		yVelocity = (float) (-initialVelocity*Math.sin(Math.toRadians(angle)));
		
		
		
		this.x = x;
		this.y = y;
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
		
	}


	public float getY() {
		return y;
	}
	
	
	public void update() {
		x += xVelocity;
		yVelocity += gravity;
		y += yVelocity;
		
	}


	public float getInitialVelocity() {
		return initialVelocity;
	}


	public void setInitialVelocity(float initialVelocity) {
		this.initialVelocity = initialVelocity;
	}


	public float getAngle() {
		return angle;
	}


	public void setAngle(float angle) {
		this.angle = angle;
	}


	public void setY(float y) {
		this.y = y;
	}


	public float getxVelocity() {
		return xVelocity;
	}


	public void setxVelocity(float xVelocity) {
		this.xVelocity = xVelocity;
	}


	public float getyVelocity() {
		return yVelocity;
	}


	public void setyVelocity(float yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	
	
	
	
}
