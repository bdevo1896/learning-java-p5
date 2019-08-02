package partD;

import partD.Magic.MagicColor;

public class Square extends Rectangle {
	
	private Point[] corners;
	private Magic.MagicColor color;
	private Point point;
	private int sideLength;
	
	public Square(Point point, MagicColor color, int sideLength) {
		super(point, color, sideLength);
		
		this.corners = new Point[4];
		this.corners[0] = point;
		this.corners[1] = new Point(point.getX()+sideLength,point.getY());
		this.corners[2] = new Point(point.getX()+sideLength,point.getY()+sideLength);
		this.corners[3] = new Point(point.getX(),point.getY()+sideLength);
		
	}
	
	/**
	 * This will print out every points location.
	 */
	public String toString(){
		String list = "";

		for(int i = 0; i < corners.length; i++){
			list += corners[i].toString();
		}

		return "Square:\n"+list;
	}

}
