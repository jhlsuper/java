package com.sd.ch8;

public class Rect extends Shape {
	private double width, height, area, perimeter;
	public Rect(double w.double h){
		this.width=w;
		this.height=h;
		this.area=w*h;
		this.perimeter=2*(w+h);
	}
	public abstract double calcArea() {
		return this.area;

	}
	public abstract double calcPerimeter(){
		return this.perimeter;
	}
	public String toString() {
		return "Rect..."+super.toString();
	}
	public static void main(String[] args){
		Rect r=new Rect(3,4);
		System.out.println("Rect's area "+r.calcArea());
		System.out.println("Rect's perimeter"+r.calcPerimeter());
		System.out.println(r.toString());
	}
}