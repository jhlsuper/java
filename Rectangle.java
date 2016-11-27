package com.sd.ch8;
class Rectangle {
	protected double length;
	protected double width;
	protected boolean isSelected;
	public Rectangle(double l, double w) {
		this.length=l;
		this.width=w;
	} 
	public double getLength() {
		return this.length;

	}
	public double getWidth() {
		return this.width;
	}
	public getSelected() {
		return this.isSelected;

	}
	public void getSelected(boolean b) {
		return this.isSelected=b;
	} 
}