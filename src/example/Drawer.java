package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Drawer implements ActionListener {
	Shape[] array;
	
	public Drawer(Shape[] array){
		this.array = array;
	}
	
	public  void drawAll(){
		for(int i = 0;i<array.length;i++){
			array[i].paint();
		}
	}
	public  void moveAll(){
		for(int i = 0;i<array.length;i++){
			array[i].move(array[i].getX()+10, array[i].getY());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		moveAll();

	}

}
