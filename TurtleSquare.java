package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleSquare {

static Turtle t1=new Turtle();
public static void drawSquare(int size) {
for (int i=0; i<4; i++) {
t1.forward(size);
t1.left(90);

}
}

public static void main(String[] args) {
drawSquare(80);
}
}