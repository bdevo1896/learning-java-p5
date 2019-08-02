package example;


public interface Shape {

	public int getX();
	public int getY();
	public String getColor();
	
	public void move(int x, int y);
	
	public void paint();
}
