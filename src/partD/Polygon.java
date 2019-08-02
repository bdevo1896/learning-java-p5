package partD;

public class Polygon {

	private Point[] corners;
	private Magic.MagicColor color;
	private Point point;

	public Polygon(Point[] corners, Magic.MagicColor color) {
		this.color = color;
		this.corners = corners;
	}

	public Polygon(Point point,Magic.MagicColor color){
		this.color = color;
		this.point = point;
		this.corners = new Point[0];
	}

	/**
	 * Returns an array of all the points making the polygon.
	 * @return
	 */
	public Point[] getCorners() {
		return corners;
	}

	/**
	 * Returns the polygon's color.
	 * @return
	 */
	public Magic.MagicColor getColor() {
		return color;
	}

	/**
	 * Returns the main point of the polygon if entered.
	 * @return
	 */
	public Point getPoint(){
		return point;
	}

	/**
	 * This method will draw a polygon based on the 'nexColor', 'deltaX', and 'deltaY'.
	 * @param newColor
	 * @param deltaX
	 * @param deltaY
	 */
	public void draw(Magic.MagicColor newColor){

		if(newColor == null){
			for(int i = 0; i < corners.length-1; i++){
				Magic.drawLine(corners[i].getX(), corners[i].getY(), corners[i+1].getX(), corners[i+1].getY(), color);
			}
			if(corners.length>=1){
				Magic.drawLine(corners[corners.length-1].getX(), corners[corners.length-1].getY(), corners[0].getX(), corners[0].getY(), color);
			}
		}else{
			for(int i = 0; i < corners.length-1; i++){
				Magic.drawLine(corners[i].getX(), corners[i].getY(), corners[i+1].getX(), corners[i+1].getY(), newColor);
			}
			if(corners.length>=1){
				Magic.drawLine(corners[corners.length-1].getX(), corners[corners.length-1].getY(), corners[0].getX(), corners[0].getY(), newColor);
			}
		}
	}

	/**
	 * This method will move the polygon by an x and y.
	 * @param deltaX
	 * @param deltaY
	 */
	public void move(int deltaX, int deltaY){

		//This line draws a white polygon over the old one.
		draw(Magic.MagicColor.White);

		//This for loop will move all of the points.
		if(corners.length>=1){
			for(int i = 0; i < corners.length; i++){
				corners[i].move(deltaX, deltaY);
			}
		}

		//This line will draw the new polygon.
		draw(color);
	}

	/**
	 * This will print out every points location.
	 */
	public String toString(){
		String list = "";

		for(int i = 0; i < corners.length; i++){
			list += corners[i].toString();
		}

		return "Polygon:\n"+list;
	}

}

