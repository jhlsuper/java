package com.sd.ch8;

public class RectangleIShape implements IShape {
	private double width;
	private double height;
	private double area;
	private double perimeter;
	public RectangleIShape(double w, double h){
		this.width=w;
		this.height=h;
		this.area=w*h;
		this.perimeter=2*(w+h);
	}
	@Override
	public double calcArea() {
		return this.area;
	}
	@Override
	public double calcPerimeter(){
		return this.perimeter;
	}
}