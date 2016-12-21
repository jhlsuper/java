package com.sd.Draw;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class DrawSquareAtSave {

	public void drawsquareatsave(){
		
		
		Turtle t1 = new Turtle();
		Double[] pos= new Double[2];
		t1.penUp();
		t1.setPos(80.0,90.0);
		t1.penDown();
	
		pos[0]=t1.getX();
		pos[1]=t1.getY();
		
		ArrayList<Double[]> posArr= new ArrayList<Double[]>();
		
		for(int i=0; i<4; i++){
			pos[0]=t1.getX();
			pos[1]=t1.getY();
			posArr.add(pos);
			t1.forward(90);
			t1.right(90);
			
			for(Double []p:posArr){
			
			 System.out.printf("(%.1f,%.1f)",p[0],p[1]);
			
			}
		}
	}
	
	public static void main(String[] args){
		DrawSquareAtSave dsas = new DrawSquareAtSave();
	
		dsas.drawsquareatsave();
	
	}
}
