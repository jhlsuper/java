package com.sd.c8;
//import com.sd.ch8.Rectangle;
public class Cube extends Rectangle {
	double height;
	public Cube(double l, double w, double h) {
		super(l,w);
		this.height=h;
	}
	public double getHeight() {
		return this.height;
	}
	public static void main(String[] args) {
		Cube c = new Cube(10.0,20.0,30.0);
		c.getHeight();
		c.getLength();
		c.getWidth();
	}

}