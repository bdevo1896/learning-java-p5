package partD;

public class Rectangle extends Polygon{
	
	private Point[] corners;
	private Magic.MagicColor color;
	private Point point;
	private int length,width;
	private int sideLength;
	
	
	
	public Rectangle(Point[] corners, Magic.MagicColor color,Point point,int length, int width) {
		//super(point,color);
		super(corners,color);
		this.point = point;
		this.length = length;
		this.width = width;
		
		this.corners = new Point[4];
		this.corners[0] = point;
		this.corners[1] = new Point(point.getX()+length,point.getY());
		this.corners[2] = new Point(point.getX()+length,point.getY()+width);
		this.corners[3] = new Point(point.getX(),point.getY()+width);
	}
	
	public Rectangle(Point point, Magic.MagicColor color,int sideLength) {
		super(point,color);
		this.sideLength = sideLength;
		this.corners = new Point[0];
		
	}


	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getSideLength() {
		return sideLength;
	}
	
	/**
	 * This will print out every points location.
	 */
	public String toString(){
		String list = "";

		for(int i = 0; i < this.corners.length; i++){
			list += this.corners[i].toString();
		}

		return "Rectangle:\n"+list;
	}
	
	

}
