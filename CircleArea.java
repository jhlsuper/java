package com.sd.ch8;
public class CircleArea extends Shape{
   private double radius;
   private double area;
   private double perimeter;
   
   public CircleArea(double radius){
      this.radius=radius;
      this.area=Math.PI*radius*radius;
      this.perimeter=2*Math.PI*radius;
   }
   
   public double calcArea(){
      return this.area;
   }
   
   public double calcPerimeter(){
      return this.perimeter;
   }
   
   public String toString(){
      return "Circle area is"+super.toString();
   }
   
}