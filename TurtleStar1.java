package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleStar1 {

static Turtle t1=new Turtle();
public static void drawStar(int size) {
for (int i=0; i<5; i++) {
t1.forward(size);
t1.left(36);
t1.forward(size);
t1.right(108);
}
}

public static void main(String[] args) {
drawStar(80);
}
}