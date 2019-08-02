package example;


public class Square implements Shape {
	private int x;
	private int y;
	private String color;
	private int side; 
	
	public Square(int x, int y, int side, String color){
		this.x = x;
		this.y = y;
		this.color = color;
		this.side = side; 
	}
	
	public void setSide(int side){
		this.side = side;
		paint();
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void move(int x, int y) {
		Magic.drawRectangle(x, y, side, side, "white");
		this.x = x;
		this.y = y;
		paint();
		
	}

	public void paint() {
		Magic.drawRectangle(x, y, side, side, color);
	}
	

}
