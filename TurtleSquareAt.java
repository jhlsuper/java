import ch.aplu.turtle.*;
class TurtleSquareAt{
static Turtle t1=new Turtle();
public static void TurtleSquareAt(int size,double x,double y) {
t1.setPos(x,y);
for (int i=0; i<4; i++) {
t1.forward(size);
t1.left(90);
}
}

public static void main(String[] args) {
TurtleSquareAt(80,50,50) ;
}
}