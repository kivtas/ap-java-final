import processing.core.PApplet;
import processing.core.PVector;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
public class Main extends PApplet {
	
	Projectile p;
	Hoop h;
	float px = 50;
	float py = 750;
	float hx = 0;
	float hy = 0;
	String magInput;
	String angleInput;
	String levelInput;
	float level;
	float mag;
	float angle;
	float length;
	float height;
	//PVector proj;
	
	
	public void setup() {
		size(1200, 800); 
		
		levelInput = JOptionPane.showInputDialog("What level would you like to play?");
		level = Float.parseFloat(levelInput);
		magInput = JOptionPane.showInputDialog("What would you like the magnitude to be?");
		mag = Float.parseFloat(magInput);
		angleInput = JOptionPane.showInputDialog("And at what angle?");
		angle = Float.parseFloat(angleInput);
		p = new Projectile(mag,angle, px, py);
		h = new Hoop(hx, hy);
		length = 100;
		height = 20;
		
		
		
	}
	

	public void draw() {
		background(0);
		reset();
		rect(h.x,h.y,length,height);
		ellipse(p.x, p.y, 20, 20);
		hoop();
		//rect(800, 300, 45, 600);
		//rect(800,200,20,100);
		//ellipse(760,232,78,10);
		//System.out.println("X is " + x);
		//System.out.println("Y is " + y);
		if (key == TAB){
			//proj.set(mouseX, mouseY);
			shootBall();
		}
		checkForWinner();
		//checkForWinner();
		//System.out.println("x is " + proj.x);
		//System.out.println("y is" + proj.y);
		//System.out.println("mag is" + proj.mag());
	}
	
	public void shootBall(){
		System.out.println("PX is " + p.x);
		System.out.println("PY is " + p.y);
		System.out.println("HX is " + h.x);
		System.out.println("HY is " + h.y);
		
		p.update();
	}
	public void hoop(){
		if (level == 1){
			h.x = 800;
			h.y = 200;
		} else if(level == 2){
			h.x = 800;
			h.update1();
			if (h.y > 800){
				h.y = 0;
				h.y++;
			}
			
		} else if (level == 3){
			h.update2();
			if (h.x > 1200){
				h.x = 0;
				h.x++;
			}
		}
	}
	
	public void checkForWinner(){
		if ( p.y > h.y - (height/2) && p.x > h.x - (length/2) && p.x < h.x + (length / 2) ){
			System.out.println(p.x);
			System.out.println(p.y);
			System.out.println(h.x);
			System.out.println(h.y);
			
			
			//System.exit(0);
			String win = JOptionPane.showInputDialog("you win! try a different level?");
			level = Float.parseFloat(win);
			
			
		}
	}
	public void reset(){
		p.x = px;
		p.y = py;
	}

}
