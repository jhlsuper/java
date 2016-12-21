package com.sd.ch8;
public class Circle extends Point { 
 private double getArea;
 private double radius;
 public Circle(int x, int y, int radius) {
 super(x,y); 
 this.radius = radius;
 }
 public double getArea() { 
 return getArea=radius*radius*Math.PI;
 }
 public static void main(String[] args) {
  Circle c = new Circle(20,20,10);
  double myArea=c.getArea();
  System.out.println(myArea);
 
 } 
 } 
