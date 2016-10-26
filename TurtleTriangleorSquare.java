package com.sd.turtle;
import java.utill.*;
import ch.aplu.turtle.*;

public class TurtleTriangleorSquare{

static Trutle t1 =new Turtle();

int size=100;
int sides;
double angle;


Scanner sc =new Scanner(System.in);

public void whichone(){
  System.out.println("Triangle(T) or Square(S)");
  
  String str=sc.nextLine();
  Shape se1 = null;
  
  if(str.equals("T")){
  se1=Shape.TRIANGLE;
  }
  
  else if (str.equals("S")) {
  se1=Shape.SQUARE;
  }

  TurtleTriangleorSquare(se1);
  
 }
 
  public void TurtleTriangleorSquare(Shape sel) {
  
  
  switch(sel) {
    case TRIANGEL:
    sides=3;
    angle=120;
    break
    
    case SQUARE:
    sides=4;
    angle=90;
    break;
    
    }
    
    public static void main(String[]args) {
      new TurtleTriangleorSquare().whichone;
      
      }
     }