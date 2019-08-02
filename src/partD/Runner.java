package partD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Runner implements ActionListener{
	
	Polygon[] polygons;
	Polygon poly;
	Rectangle rect;
	Triangle tri;
	Square square;
	
	
	public Runner(Polygon[] polygons){
		this.polygons = polygons;
	}
	
	/**
	 * Draws every 'Polygon' object in the array.
	 */
	public void drawAll(){
		for(int i = 0; i < polygons.length; i++){
			System.out.println("Drew polygon at i: "+i);

			polygons[i].draw(null);
		}

		
	}
	
	/**
	 * Moves every 'Polygon' object in the array.
	 */
	public void moveAll(){
		for(int i = 0; i < polygons.length; i++){
			System.out.println("Moved polygon at i: "+i);
			polygons[i].move(1,1);
		}
	}
	
	/**
	 * Calls every object's 'toString' in the array.
	 * @return
	 */
	public String printAll(){
		String finalResult = "";
		for(int i = 0; i < polygons.length; i++){
			finalResult += polygons[i].toString();
		}
		
		return finalResult;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println(printAll());
		moveAll();
		
	}
	
}

