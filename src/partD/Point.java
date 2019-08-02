package partD;

public class Point {
	
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void move(int deltaX, int deltaY){
		x += deltaX;
		y += deltaY;
	}
	
	public String toString(){
		return "Location: ("+getX()+","+getY()+")\n";
	}

}
