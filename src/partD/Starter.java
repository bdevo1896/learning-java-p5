package partD;

import javax.swing.Timer;

public class Starter {
	
	public static void main(String[] args) {
		
		Point[] corners = new Point[5];
		corners[0] = new Point(0,0);
		corners[1] = new Point(30,50);
		corners[2] = new Point(100,50);
		corners[3] = new Point(125,75);
		corners[4] = new Point(150,60);
		
		Rectangle rect = new Rectangle(new Point[]{} ,Magic.MagicColor.Red,new Point(80,200),100,50);
		
		Triangle tri = new Triangle(new Point(300,300),Magic.MagicColor.Green,100,50);
		
		Square square = new Square(new Point(300,300),Magic.MagicColor.Magenta,100);
		
		Polygon poly = new Polygon(corners, Magic.MagicColor.Cyan);
		
		//This array of polygons will hold 'poly','rect','tri',and 'square'
		Polygon[] polygons = new Polygon[4];
		polygons[0] = poly;
		polygons[1] = rect;
		polygons[2] = tri;
		polygons[3] = square;
		
		Runner run = new Runner(polygons);
		
		run.drawAll();
		
		Timer time = new Timer(500,run);
		time.start();
		
	}
	

}
