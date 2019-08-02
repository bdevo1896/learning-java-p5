package partD;

public class Triangle extends Polygon{

	private Point[] corners;
	private Magic.MagicColor color;
	private Point point;
	private int base,height;

	public Triangle(Point point, Magic.MagicColor color,int base, int height) {

		super(point,color);
		this.base = base;
		this.height = height;

		this.corners = new Point[3];
		this.corners[0] = point;
		this.corners[1] = new Point(point.getX()+base,point.getY());
		this.corners[2] = new Point((point.getX()+base)/2,point.getY()+height);
	}
	
	/**
	 * Returns base.
	 * @return
	 */
	public int getBase() {
		return base;
	}
	
	/**
	 * Returns height
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * This will print out every points location.
	 */
	public String toString(){
		String list = "";

		for(int i = 0; i < corners.length; i++){
			list += corners[i].toString();
		}

		return "Triangle:\n"+list;
	}

}
