
public class Hoop {
	float x;
	float y;
	float hoopLength; 
	
	
	public Hoop(float x, float y){
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


	public void setY(float y) {
		this.y = y;
	}
	public void update1(){
		if (y >= 0){
			y+=2;
		} else if (y > 800){
			y = 0;
			y+=2;
		}
	}
	public void update2(){
		y = 200;
		if (x >= 0){
			x+=2;
		} else if (x > 1200){
			x = 0;
			x+=2;
		}
	}


	public float getHoopLength() {
		return hoopLength;
	}


	public void setHoopLength(float hoopLength) {
		this.hoopLength = hoopLength;
	}

}
