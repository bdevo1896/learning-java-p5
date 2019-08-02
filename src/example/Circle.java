package example;


public class Circle implements Shape {
	private int x;
	private int y;
	private int radius;
	private String color;
	
	public Circle(int x, int y, int radius, String color){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
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
		Magic.drawOval(x-radius, y-radius, radius*2, radius*2, "white");
		this.x = x;
		this.y = y;
		paint();

	}

	
	public void paint() {
		Magic.drawOval(x-radius, y-radius, radius*2, radius*2, color);

	}

}
